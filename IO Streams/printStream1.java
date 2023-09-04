package filePra;
//SERIALIZATION
import java.io.*;
class Student
{
	int rollno;
	String name;
	String dept;
}
public class printStream1 {

	public static void main(String[] args)throws Exception
	{
		/*
      FileOutputStream fos=new FileOutputStream("C:/Users/Anushka Saxena/eclipse-workspace/IO/src/Student1.txt");
      PrintStream ps= new PrintStream(fos);
      Student s=new Student();
      s.rollno=9;
      s.name="Anushka";
      s.dept="CSE";
      ps.println(s.rollno);
      ps.println(s.name);
      ps.println(s.dept);
      ps.close();
      fos.close();
		*/
		FileInputStream fis=new FileInputStream("C:/Users/Anushka Saxena/eclipse-workspace/IO/src/Student1.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
		Student ss=new Student();
		ss.rollno=Integer.parseInt(br.readLine());
		ss.name=br.readLine();
		ss.dept=br.readLine();
		System.out.println(ss.rollno+" "+ss.name+" "+ss.dept);
		br.close();
		fis.close();
	}

}
