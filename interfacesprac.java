
interface test{
	void meth1();
	void meth2();
}
class mytest implements test{
	public void meth1()
	{
		System.out.println("meth1");
	}
	public void meth2()
	{
		System.out.println("meth2");
	}
	public void meth3()
	{
		System.out.println("meth3");
	}
	
}
public class interfacesprac {

	public static void main(String[] args) {
       test x;//reference of an interface allowed
      // test k= new test(); object of an interface cant be created
       test t= new mytest();
       t.meth1();
       t.meth2();
       mytest m= new mytest();
       m.meth3();
       
	}

}
