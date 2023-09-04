package filePra;
import java.io.*;
class stud
{
	int rollno;
	String name;
	String dept;
	float avg;
}
public class dataIPopStream {

	public static void main(String[] args)throws Exception 
	{
		FileOutputStream fos=new FileOutputStream("C:/Users/Anushka Saxena/eclipse-workspace/IO/src/data.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		stud s=new stud();
		s.rollno=34;
		s.name="Anushka";
		s.dept="CSE";
		s.avg=45.98f;
		dos.writeInt(s.rollno);
		dos.writeUTF(s.name);
		dos.writeUTF(s.dept);
		dos.writeFloat(s.avg);
		dos.close();
		fos.close();
		FileInputStream fis=new FileInputStream("C:/Users/Anushka Saxena/eclipse-workspace/IO/src/data.txt");
		DataInputStream dis=new DataInputStream(fis);
		stud s1=new stud();
		s1.rollno=dis.readInt();
		s1.name=dis.readUTF();
		s1.dept=dis.readUTF();
		s1.avg=dis.readFloat();
		System.out.println(s1.rollno+" "+s1.name+" "+s1.dept+s1.avg);
		dis.close();
		fis.close();
  
	}

}
