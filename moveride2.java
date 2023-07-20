package moveride2;
class car{
	public void start() {System.out.println("car is on");}
	public void accelerate() {System.out.println("accerlated");}
	public void gear() {System.out.println("manual gear");}
}
class luxurycar extends car{
	@Override
	public void gear() {System.out.println("automatic gear");}
	public void sunroof() {System.out.println("sunroof is opened");}
}
public class moveride2 {

	public static void main(String[] args) {
		car c= new car();
		c.start();
		c.accelerate();
		c.gear();
		luxurycar l= new luxurycar();
		l.start();
		l.accelerate();
		l.gear();
		l.sunroof();
	
		

	}

}
