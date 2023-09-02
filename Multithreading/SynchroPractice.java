package SynchronizationPrac;

class Mydata{
	
	synchronized public void display(String str)
	{
		//synchronized(this)
		//{
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));//A critical section as accessed by multiple threads simultaneously
		try {Thread.sleep(10);}catch(Exception e) {}
		}
		//}
	}
}

class Mythread1 extends Thread{
	Mydata d;
	public Mythread1(Mydata d)
	{
		this.d=d;
	}
	public void run()
	{
		d.display(" Hello World ");
	}
}

class Mythread2 extends Thread{
	Mydata d;
	public Mythread2(Mydata d)
	{
		this.d=d;
	}
	public void run()
	{
		d.display("Welcome");
	}
}

public class SynchroPractice {

	public static void main(String[] args) {

		Mydata d= new Mydata();
		Mythread1 t1=new Mythread1(d);
		Mythread2 t2=new Mythread2(d);
		
		t2.start();
		t1.start();
	}

}
