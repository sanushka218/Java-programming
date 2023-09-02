package lambdaExp;
@FunctionalInterface
interface Mylambda
{
	void display();
}
//class my implements Mylambda
//{
//	public void display()
//	{
//		System.out.println("hello world");
//	}
//}
public class lambdaExp1 {

	public static void main(String[] args) {

//		Mylambda m= new Mylambda() {
//			public void display()
//			{
//				System.out.println("Hello world");
//			}
//		};//ANNOYMUS INNER CLASS
		
		Mylambda m=()->{System.out.println("hii");};//LAMBDA EXPN
		m.display();
	}

}
