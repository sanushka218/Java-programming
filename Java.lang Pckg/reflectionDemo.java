import java.lang.reflect.*;
//
class my{
	private int a;
	protected int b;
	public int c;
	int d;
	public my() {}
	public my(int x, int y) {}
	public void display(String s1, String s2) {}
	public int show(int x, int y) {return 0;}
	
}
public class reflectionDemo {

	public static void main(String[] args) {

        //without creating an object of my class
		Class c=my.class;
		//with creating an object
//		my m=new my();
//		Class c1=m.getClass();
		
		//name of class
		System.out.println(c.getName());
		
		//declared variables of a class
		Field f[]=c.getDeclaredFields();
		for(Field x:f)
		{
			System.out.println(x);
		}
		
		//constructors
		Constructor con[]=c.getConstructors();
		for(Constructor ct:con)
		{
			System.out.println(ct);
		}
		
		//methods
		Method md[]=c.getMethods();
		for(Method m:md)
		{
			System.out.println(m);
		}
		//!!Output mein display,show ke alwa jo methods aarhe hai voh Object class se aarhe hai
		Parameter p[] =md[0].getParameters();
		for(Parameter y:p)
		{
			System.out.println(y);
		}
		
	}

}
