package multiThreading;
//class Mythread extends Thread{
//	public void run()
//	{
//		int i=1;
//		while(true)
//		{
//			System.out.println(i+ " hello ");
//			i++;
//		}
//	}
//}
public class threadPrac1 extends Thread {
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i+ " hello ");
			i++;
		}
	}

	public static void main(String[] args) {

//		Mythread t=new Mythread();
//		t.start();
		
		threadPrac1 t2=new threadPrac1();
		t2.start();
		int j=1;
		while(true)
		{
			System.out.println(j+ " world ");
			j++;
		}
	}

}
