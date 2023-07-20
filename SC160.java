
import java.util.Date;
//When a student enroll then the rollNO is automatically generated  and not passed by main
//through class constructor. Done using static variable that keeps count of number of students
class student{
	private String rollNo;
	private static int count=1;
	private String generateRollNo()
	{
		Date d= new Date();
		String rn= "AKTU"+(d.getYear()+1900)+"-"+count;
		count++;
		return rn;
	}
	student()
	{
		rollNo= generateRollNo();
	}
	public String getRollno()
	{
		return rollNo;
	}
}
public class SC160 {

	public static void main(String[] args) {
	  System.out.println("Hello Welcome to AKTU UNI");
	  student s1= new student();
	  System.out.println("You are enrolled successfully in the university & your rollNumber is: "+s1.getRollno());
	  student s2= new student();
	  System.out.println("You are enrolled successfully in the university & your rollNumber is: "+s2.getRollno());
	  student s3= new student();
	  System.out.println("You are enrolled successfully in the university & your rollNumber is: "+s3.getRollno());

	}

}
