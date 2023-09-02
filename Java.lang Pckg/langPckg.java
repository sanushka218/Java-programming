import java.lang.*;
class myobject{
	
	public String toString()
	{
		return"anushahahaka";
	}
	public int hashCode()
	{
		return 200;
	}
	public boolean equals(Object o)
	{
		return this.hashCode()==o.hashCode();
	}
}
public class langPckg {

	public static void main(String[] args) {

//		Object o1=new Object();
//		System.out.println(o1.toString());
//		System.out.println(o1.hashCode());
		myobject o2=new myobject();
		myobject o3=new myobject();
		//System.out.println(o2);

		System.out.println(o2.equals(o3));
		}

}
