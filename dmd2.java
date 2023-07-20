
class a{}
class b extends a{}
class parent{
	protected void d() {System.out.println("super");}
}
class child extends parent{
	@Override
	public void d(){System.out.println("sub");}
}
public class dmd2 {

	public static void main(String[] args) {
		child c= new child();
		c.d();

	}

}
