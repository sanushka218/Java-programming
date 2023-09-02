//TEAHCER-STUDENT PROBLEM
class Whiteboard{
	String text;
	int noOfStudent=0;
	int count=0;
	public void attendace()
	{
		noOfStudent++;
	}
	synchronized public void write(String msg)
	{
		System.out.println("teacher is writing "+msg);
		while(count!=0) {
			try {wait();}catch(Exception e) {}
		}
		//System.out.println("Teacher is Writing");
		text=msg;
		count=noOfStudent;
		notifyAll();
	}
	synchronized public String read()
	{
		while(count==0)
		{
			try {wait();}catch(Exception e) {}	
		}
		//System.out.println("Student no "+count+" is reading");
		String t=text;
		count--;
		if(count==0)
		{
			notify();
		}
		return t;
	}
}
class teacher extends Thread{
	Whiteboard w;
	String notes[]= {"HI this is a Java program", "Its an OOP language", "We are currently learning IPC","end"};
	public teacher(Whiteboard w)
	{
		this.w=w;
	}
	public void run()
	{
		for(int i=0;i<notes.length;i++)
		{
			w.write(notes[i]);
		}
	}
}
class student extends Thread{
	String name;
	Whiteboard w;
	public student(String n,Whiteboard w)
	{
		name=n;
		this.w=w;
	}
	public void run()
	{
		String readed;
		w.attendace();
		do
		{
		readed=w.read();
		System.out.println(name+" reading "+readed);
		System.out.flush();
		}while(!readed.equals("end"));
	}
}
public class SC197 {

	public static void main(String[] args) {

		Whiteboard w=new Whiteboard();
		teacher t=new teacher(w);
		
		student s1=new student("1.Anu ",w);
		student s2=new student("2.Anika ",w);
		student s3=new student("3.Somiya ",w);
		student s4=new student("4.Pallu ",w);

		t.start();
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();

	}

}
