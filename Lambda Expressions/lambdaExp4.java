package lambdaExp;
interface lexp
{
	void display(String str);
}
interface lexp2
{
	int show(String s1, String s2);
}
class hi
{
	public static void rev(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
}
//NON STATIC METHODS
class hiNonStatic
{
	public void xy(String str)
	{
		System.out.println(str+" non static example");
	}
}
class demo{
	public demo(String s)
	{
		System.out.println(s.toUpperCase());
	}
}
public class lambdaExp4 {

	public static void main(String[] args) {

		lexp l= System.out::println;//println is a static method
		l.display("anushka");
		lexp lm= hi::rev;//assigned a static method reverse
		lm.display("anushka");
		//NON STATIC METHOD
		hiNonStatic hns= new hiNonStatic();
		lexp lmn=hns::xy;
		lmn.display("anushka");
		//constrcutor as method reference
		lexp lmno=demo::new;
		lmno.display("anushka");
		//IMP STRING COMPARE TO METHOD
		//interface is lexp2
		
		lexp2 l2=String::compareTo;
		System.out.println(l2.show("anushka", "anushka"));
			
		
	}

}
