package pckgg2;
//D/F PCKG SUBCLASS(demo6) & Non Subclass
import pckgg.demo4;

public class accessModifierOutsidepkg extends demo4{

	public void show()
	{
		System.out.println(a+b+c+d);//i.e. default and protected not visible here
		demo4 d4=new demo4();
		System.out.println(d4.d);//only public visible
	}

}
