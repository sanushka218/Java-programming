package filePra;
import java.io.*;
class Producer extends Thread{
	OutputStream os;
	public Producer(OutputStream o)
	{
		os=o;
	}
	public void run()
	{
       int count=1;
       while(true)
       {
    	   try
    	   {
    		   os.write(count);
    		   os.flush();
    		   System.out.println("producer "+count);
    		   System.out.flush();
    		   Thread.sleep(100);
    		   count++;
    	   }catch(Exception e) {}
    	   
       }
	}
}
class Consumer extends Thread{
	InputStream is;
	public Consumer(InputStream i)
	{
		is=i;
	}
	public void run()
	{
       int x;
       while(true)
       {
    	   try
    	   {
    		  x=is.read();
    		   System.out.println("Consumer "+x);
    		   System.out.flush();
    		   Thread.sleep(100);
    	   }catch(Exception e) {}   
       }
	}
}
public class pipedStream1 {

	public static void main (String[] args)throws Exception
	{

		PipedInputStream pi=new PipedInputStream();
		PipedOutputStream po=new PipedOutputStream();
		
		pi.connect(po);
		Producer p=new Producer(po);
		Consumer c=new Consumer(pi);
		p.start();
		c.start();

	}

}
