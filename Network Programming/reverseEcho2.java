package networkProgramming;
//MUTLI THREADED REVERSE ECHO SERVER
import java.io.*;
import java.net.*;
public class reverseEcho2 extends Thread
{
    Socket stk;
    
    public reverseEcho2(Socket st)
    {
    	stk=st;
    }
    public void run()
    {
    	try
    	{
    		BufferedReader br= new BufferedReader(new InputStreamReader(stk.getInputStream()));
    		PrintStream ps=new PrintStream(stk.getOutputStream());
    		
    		String msg;
    		StringBuilder rev;
    		do
    		{
    			msg=br.readLine();
    			rev= new StringBuilder(msg);
    			rev.reverse();
    			msg=rev.toString();
    		}while(msg.equals("dne"));
    		stk.close();
    		ps.close();
    		br.close();
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	
    }
	public static void main(String[] args)throws Exception {

		ServerSocket ss=new ServerSocket(2000);
		Socket stk;
		int count=1;
		do
		{
		stk=ss.accept();
		System.out.println("client connected: "+count);
		count++;
		reverseEcho2 re= new reverseEcho2(stk);
		re.start();
		}while(true);
	}
}
class client2 
{
	public static void main(String[] args)throws Exception
	{
		Socket stk=new Socket("localhost",22000);
		//local host i.e. this m/c only. it act as ip
		BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps=new PrintStream(stk.getOutputStream());
		
		String msg;
		
		do
		{
			msg=keyb.readLine();//reading from keyboard
			ps.println(msg);//putting that to the stream
			msg=br.readLine();//reading from server
			System.out.println("from server "+msg);
		}while(!msg.equals("dne"));
		ps.close();
		br.close();
		keyb.close();
		stk.close();
	}
}
