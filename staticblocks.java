
class x{
	static {
		System.out.println("Block 1");
	}
	static {
	System.out.println("Block 2");
	}
}
//When these static blocks are in a class then these are not executed bz the class is not loaded, to load the class just create an object of it in main
public class staticblocks {
//	static {
//		System.out.println("Block 1");
//	}
	public static void main(String[] args) {
//Nothing in main still printing blocks 1 &2 bz its executed when class is loaded
		//IMP-> static blocks are executed before main
		System.out.println("Main");
		x y= new x();

	}
//static {
//	System.out.println("Block 2");
//}
}
