package multiThreading;
class myythread extends Thread{
	public myythread(String name)
	{
		super(name);
		setPriority(Thread.MIN_PRIORITY);
	}
	public void run()
	{
		int c=1;
		while(true)
		{
			System.out.println(c++);
			try {
			Thread.sleep(100);//sleep for 100 ms b/w every counter
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
public class threadPrac3 {

	public static void main(String[] args) {

		myythread t=new myythread("thread 1");
//		System.out.println(t.getId());
//		System.out.println(t.getName());
//		System.out.println(t.getPriority());
		t.start();
//		System.out.println(t.getState());
//		System.out.println(t.isAlive());
		t.interrupt();
	}

}
