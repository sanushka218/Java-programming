package filePra;
//USING OBJECT I/P O/P STREAM
import java.io.*;
class stu implements Serializable
{
	private int rolln;
	private String name;
	private String dept;
	private float avg;
	public static int h=10;
	public transient int t=987;
	public stu()
	{
		
	}
	public stu(int r,String n,String d,float a)
	{
		this.rolln=r;
		this.name=n;
		this.dept=d;
		this.avg=a;
		h=999;
		this.t=987;
	}
	public String toString()
	{
		return("Name: "+name+" RollNo: "+rolln+" Department: "+dept+" Average: "+avg+" static: "+h+" transient: "+t);
	}
}
public class serialization 
{

	public static void main(String[] args)throws Exception 
	{

		FileOutputStream fos=new FileOutputStream("C:/Users/Anushka Saxena/eclipse-workspace/IO/src/data.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        stu s1=new stu(34,"Anushka","CSE",87.95f);
        oos.writeObject(s1);
        oos.close();
        fos.close();
		FileInputStream fis=new FileInputStream("C:/Users/Anushka Saxena/eclipse-workspace/IO/src/data.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        stu s2;
        s2=(stu)ois.readObject();
        System.out.println(s2);
        ois.close();
        fis.close();
        
        
	}

}
