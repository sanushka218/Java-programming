
abstract class Super{
	public Super() {System.out.println("Super Constructor");}
	public void meth1() {System.out.println("meth1 of super");}
	abstract public void meth2();
}
class sub extends Super{
	@Override
	public void meth2() {System.out.println("Method 2 of SUB");}
}
public class abstractclass {

	public static void main(String[] args) {
       Super s= new sub();
       s.meth1();
       s.meth2();
	}

}
