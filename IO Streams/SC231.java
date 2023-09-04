package filePra;
import java.io.*;
class customer implements Serializable
{
	private String custid;
	private String name;
	private long phoneNo;
	private String dob;
	private float balance;
	public static int count=0;
	public customer()
	{
		
	}
	public customer(String n, long p,String d,float b)
	{
		count++;
		custid="ABC_231B"+count;
		this.name=n;
		this.phoneNo=p;
		this.dob=d;
		this.balance=b;	
	}
	public String toString()
	{
		return("CUSTOMER DETAILS:\nCustomer id: "+custid+"\nName: "+name+"\nPhone Number: "+phoneNo+"\nDate Of Birth: "+dob+"\n Current Balance: "+balance);
		
	}
	
}
public class SC231 {

	public static void main(String[] args)throws Exception
	{
		
		customer c1=new customer("anushka", Long.valueOf(912345670),"22-07-2004",87554.9f);
		customer c2= new customer("samprati",Long.valueOf(923456781),"24-09-2007",98663.99f);
		customer c3=new customer("nidhi", Long.valueOf(934567802),"10-01-1974",67990.9f);
		FileOutputStream fos=new FileOutputStream("C:/Users/Anushka Saxena/eclipse-workspace/IO/src/SC231.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeInt(customer.count);
        oos.writeObject(c1);
        oos.writeObject(c2);
        oos.writeObject(c3);
        oos.close();
        fos.close();
        FileInputStream fis=new FileInputStream("C:/Users/Anushka Saxena/eclipse-workspace/IO/src/SC231.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
	    int noOfCustomers=ois.readInt();
	    customer c;
	    System.out.println("Total Number of Current customers: "+noOfCustomers);
	    for(int i=0;i<noOfCustomers;i++)
	    {
	    	c=(customer)ois.readObject();
	    	System.out.println("Customer Number :"+(i+1));
	    	System.out.println(c);	
	    }
	    ois.close();
	    fis.close();

	}

}
