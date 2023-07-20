
interface member{
	void callback();
}
class customer implements member{
	String name;
	customer(String n){
		name=n;
	}
	public void callback() {
		System.out.println("OK I will visit "+ name);}
}
class store{
	member mem[]=new member[10];
	int count=0;
	void register(member m) {
		mem[count++]=m;
	}
	void invitesale()
	{
		for(int i=0;i<count;i++)
		{
			mem[i].callback();
		}
	}
}
public class SC145 {

	public static void main(String[] args) {
    store s= new store();
    customer c1= new customer("Anushka");
    customer c2= new customer("Samprati");
    s.register(c1);
    s.register(c2);
    s.invitesale();
    
	}

}
