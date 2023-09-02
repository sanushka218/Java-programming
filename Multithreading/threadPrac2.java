package multiThreading;

//class Myrun implements Runnable{
//	public void run() {}
//}

class MyThread extends Thread{
	public MyThread(String name)
	{
		super(name);//a constructor of super class i.e. Thread 
		
	}
}
public class threadPrac2 {

	public static void main(String[] args) {

		//Thread t= new Thread(new Myrun(),"My Name");//annonymus object of Myrun bz w/o reference
		MyThread t= new MyThread("my name");
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.isAlive());
	}

}
