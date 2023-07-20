
class account{
    public String accountno;
    public String name;
    public long phoneno;
    public String dob;
    protected long balance;
    public account(String a, String n, long p, String d, long b)
    {
        this.accountno=a;
        this.name=n;
        this.phoneno=p;
        this.dob=d;
        this.balance=b;
    } 
    public long getbalance(){return balance;}
    public String toString()
    {
    	return ("Acc no:- "+accountno+"\nAcc holder name: "+name+"\nPhone no: "+phoneno+"\nDOB: "+dob+"\nCurrent balance: "+balance);
    }
}
class savingacc extends account{
	public savingacc(String a, String n, long p, String d, long b)
    {
        super(a, n, p, d, b);
    }
    public void creditbal(long bal)
    {
        balance+=bal;
    }
    public void debit(long dt)
    {
        if(dt>balance){System.out.println("Debit not possible");}
        else balance-=dt;
    }
}
class loanacc extends account{
    public loanacc(String a, String n, long p, String d, long b)
    {
        super(a, n, p, d, b);
    }
    public void payEMI(long amt){balance-=amt;}
    public void repay(long amt){if(balance==amt)balance=0;}
}
public class SC122 {

	public static void main(String[] args) {
		account a= new account("1288AB","Anushka",967557807,"22-07-04",8465);
		System.out.println(a);
		System.out.println("/***************************************/");
		loanacc l= new loanacc("XY55R", "Aryan", 98535700, "23-09-01", 1744);
	    System.out.println(l);
	    l.payEMI(890);
	    System.out.println("Your current balance after EMI payment is "+l.getbalance());
	    l.repay(854);
	    System.out.println("Your current balance after Repay is "+l.getbalance());
	    System.out.println("/***************************************/");
	    savingacc s= new savingacc("CD77Y","Somiya",977578,"23-09-03",900);
	    System.out.println(s);
	    s.creditbal(886);
	    System.out.println("Balance after credit "+s.getbalance());
	    s.debit(77777);
	}

}
