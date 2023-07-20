
//DYNAMIC METHOD DISPATCH
class suuper{
	public void meth1() {System.out.println("super meth 1");}
	public void meth2() {System.out.println("super meth 2");}
}
class sub extends suuper{
	@Override
	public void meth2() {System.out.println("sub meth 2");}
	public void meth3() {System.out.println("sub meth 3");}

}
public class dmd {

	public static void main(String[] args) {
//    Super s= new Super();
//    s.meth1();
//    s.meth2();
//    sub t= new sub();
//    t.meth1();
//    t.meth2();
//    t.meth3();
	Super m= new sub();
	m.meth1();
	m.meth2();
	}

}
