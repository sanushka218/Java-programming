class Myydat{
	int value=1;
	boolean flag=true;//t=p f=c
	synchronized public void set(int v)
	{
		while(flag!=true)
		{
			try{wait();}catch(Exception e) {}
		}
		value=v;
		flag=false;//for c
		notify();
	}
	synchronized public int get()
	{
		int x;
		while(flag!=false)
		{
			try{wait();}catch(Exception e) {}

		}
		x=value;
		flag=true;
		notify();
		return x;
	}
}
class producer extends Thread{
	Myydat data;
	public producer(Myydat d)
	{
		this.data=d;
	}
	public void run()
	{
		int count=1;
		while(true)
		{
			data.set(count);
			System.out.println("Producer "+count);
			count++;
		}
	}
}
class consumer extends Thread{
	Myydat data;
	public consumer(Myydat d)
	{
		this.data=d;
	}
	public void run()
	{
		int value;
		while(true)
		{
		   value=data.get();
		   System.out.println("consumer "+value);   
		}
	}
}
public class IPC {

	public static void main(String[] args) {

		Myydat d=new Myydat();
		producer p= new producer(d);
		consumer c=new consumer(d);
		p.start();
		c.start();
	}

}


