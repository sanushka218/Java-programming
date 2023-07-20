
//abstract class my{
//	abstract public void show();
//}
//class outer{
//	public void display()
//	{
//		//LOCAL INNER CLASS
////		class inner{
////			public void d() {
////				System.out.println("hii");
////			}
////		}
////		//inner i= new inner();
////		//i.d();
////		new inner().d();//annonymus object
//		
//		//ANNONYMUS INNER CLASS
//		my m= new my() {public void show() {System.out.println("hiiiiii");}};
//		m.show();
//		new my() {public void show() {System.out.println("hiiiiii");}}.show();//annonymus class & annonymus obj inherting from class my	
//	}
//}
class outerr{
	static int x=10;
	int y=8;
	static class innerr{
		public void show()
		{
			System.out.println(x);
		}
	}
}
public class localStaticinner {

	public static void main(String[] args) {
//         outer o= new outer();
//        o.display();
		
		outerr.innerr i= new outerr.innerr();
		i.show();
	}

}
