package multiThreading;

public class runnableInterface implements Runnable {
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

		runnableInterface m= new runnableInterface();
		Thread t= new Thread(m);
		t.start();
		int j=1;
		while(true)
		{
			System.out.println(j+ " world ");
			j++;
		}
		
	}

}
