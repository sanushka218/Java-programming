package pckgg;
import pckgg.demo4;
//SAME PCKG SUBCLASS(demo5) & NONSUBCLASS(demo4)
class demo5 extends demo4{}
public class accessModifyInsidePackage {
	public static void main(String args[])
	{
		demo5 d5= new demo5();
		System.out.println(d5.a+d5.c+d5.d);
		demo4 d4= new demo4();
		System.out.println(d4.a+d4.c+d4.d);
		
	}

}
