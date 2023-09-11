package networkProgramming;
import java.net.*;
import java.io.*;
public class reverseEcho1 {

	public static void main(String[] args)throws Exception
	{
       //SERVER CLASS
		
		ServerSocket ss=new ServerSocket(22000);
		Socket stk= ss.accept();
		//Server is not creating an object of socket instead it is accepting a socket obj from the client	
		BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
		/* Meaning of above line
		 from a socket get a i/p stream,convert it into a reader and given
		 to buffered reader so it can read from client
		 */
		PrintStream ps=new PrintStream(stk.getOutputStream());
		//the server should read client msg and reverse it and send it back
		String msg;
		StringBuilder rev;
		do {
			msg=br.readLine();//reading
			
			rev=new StringBuilder(msg);
			rev.reverse();
			msg=rev.toString();
			
			ps.println(msg);//writing
		}while(msg.equals("dne"));
		ps.close();
		br.close();
		stk.close();
		ss.close();

	}

}
class client
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
