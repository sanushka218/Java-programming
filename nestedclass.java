
class outer{
	int a=9;
	class inner{
		int b=1;
		public void innerd() {
			System.out.println("a+b ="+(a+b));
		}
	}
	public void outerd() {
		inner i= new inner();
		System.out.println(i.b);
		i.innerd();
	}
}
public class nestedclass {

	public static void main(String[] args) {
		outer o= new outer();
		o.outerd();
		outer.inner x= new outer().new inner();
		x.innerd();
		
		

	}

}
