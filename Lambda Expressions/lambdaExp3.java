package lambdaExp;
@FunctionalInterface
interface mlda
{
	void display();
}
/*
class demo
{
	 int d=99;
    public void meth1()
    {
    	final int c=0;
    	mlda m=()->
    	{
    		final int b=7;
    		d++;
    		System.out.println("Hi, this is lambda exp"+c+b+d);
    		//method local var and var of exp cant be modified but class var can be modified
    	};
    	m.display();
    }
//    public void meth2()
//    {
//    	mlda n=()->
//    	{
//    		System.out.println("hi, this is NOT lambda exp");
//    	};
//    	n.display();
//    }
}
*/
//LEXPN as parameter
class useLambda
{
	public void callLambda(mlda ml)
	{
		ml.display();
	}
}
public class lambdaExp3 {

	public static void main(String[] args) {
		/*
		
		demo d= new demo();
		d.meth1();
		//d.meth2();
		
		*/
		useLambda ul= new useLambda();
		ul.callLambda(()->{System.out.println("lambda exp as a parameter");});
		

	}

}
