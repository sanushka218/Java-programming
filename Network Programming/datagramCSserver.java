package networkProgramming;
import java.net.*;
public class datagramCSserver {

	//CLIENT
	
	public static void main(String[] args) throws Exception{

		DatagramSocket ds=new DatagramSocket(2001);
		String msg="hello";
		DatagramPacket dp= new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2000);
		
	    ds.send(dp);
	    
	    byte b[]=new byte[20];
	    dp=new DatagramPacket(b,20);
	    ds.receive(dp);
	    
	    msg=new String(dp.getData()).trim();//dp.getdata will give huge data in byte that get converted to string through string class, and trim reduces unnessacry spaces
	    System.out.println("from server "+msg);
	    ds.close();
	    }
}
class dpserver
{
	//server
	public static void main(String[] args) throws Exception{
//first server receive the packet, then it create a string with that packet and reverse that string and then send that reversed string to client thrgh datagram packet
			
		DatagramSocket ds=new DatagramSocket(2001);
		
		byte b[]=new byte[20];
	    DatagramPacket dp=new DatagramPacket(b,20);
	    ds.receive(dp);
	    
	    String msg=new String(dp.getData()).trim();
	    System.out.println("from server "+msg);
	    StringBuilder sb=new StringBuilder(msg);
	    sb.reverse();
	    msg=sb.toString();
	    
	    dp= new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2001);//sending
	    ds.send(dp);
	    ds.close();
		}
}
