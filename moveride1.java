class tv{
	public void switchon() {System.out.println("Tv is on");}
	public void changechannel() {System.out.println("Channel is changed");}
}
class smarttv extends tv{
	@Override
	public void switchon() {System.out.println("Smart Tv is on");}
	@Override
	public void changechannel() {System.out.println("Smart TV Channel is changed");}
	public void browse() {System.out.println("Smart Tv browse");}
}
public class moveride1 {

	public static void main(String[] args) {
//		tv t= new tv();
//		t.switchon();
//		t.changechannel();
//      tv t= new smarttv();
//      t.switchon();
//      t.changechannel();
		smarttv t= new smarttv();
		t.browse();
     
	}
}
