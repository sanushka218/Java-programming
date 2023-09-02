package multiThreading;
class mmythread extends Thread{
	public mmythread(String name)
	{
		super(name);
		setPriority(Thread.MIN_PRIORITY);
	}
	public void run()
	{
		int c=1;
		while(true)
		{
			System.out.println(c+++" thread ");
//			try {
//			Thread.sleep(100);//sleep for 100 ms b/w every counter
//			}
//			catch(InterruptedException e)
//			{
//				System.out.println(e);
//			}
		}
	}
}
public class threadPrac4 {

	public static void main(String[] args) {

		mmythread t=new mmythread("thread 1");
		t.start();
		int d=1;
		while(true)
		{
			System.out.println(d+++" main ");
			Thread.yield();
		}
		
		//DAEMON
//		t.setDaemon(true);
//        t.start();
        // try{Thread.sleep(10);}catch(Exception e) {}

        //JOIN
//        Thread mainThread = Thread.currentThread();
//        try {
//        mainThread.join();
//        }
//        catch(Exception e) {}
        
        
        
	}

}
