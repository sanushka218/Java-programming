package SynchronizationPrac;
//class ATM- checkbalance(name), withdraw
//class customer- atm object, name,amount,useatm

class ATM{
	
	synchronized public void checkbalance(String name)
	{
		System.out.print(name+ " checking ");
		try{Thread.sleep(10);}catch(Exception e) {}
		System.out.println("Balance");
	}
	synchronized public void withdraw(String name, int amount)
	{
		System.out.print(name+ " withdrawing ");
		try {Thread.sleep(10);}catch(Exception e) {}
		System.out.println(amount);
	}
}

class customer extends Thread{
	String name;
	int amount;
	ATM atm;
	
	public customer(String n,int a, ATM am)
	{
		this.name=n;
		this.amount=a;
		this.atm=am;
	}
	
	public void useAtm(){
		atm.checkbalance(name);
		atm.withdraw(name, amount);	
	}
	
	public void run()
	{
		useAtm();
	}
}
public class SC193 {

	public static void main(String[] args) {

		ATM atm= new ATM();
		customer c1=new customer("anushka", 100,atm);
		customer c2= new customer("anika",20,atm);
		c1.start();
		c2.start();
	}

}
