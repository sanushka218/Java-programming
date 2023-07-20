
class coffeeMachine{
	private int sugarquant;
	private int waterquant;
	private int coffeequant;
	private int milkquant;
	
	static private coffeeMachine our=null;
	
	private coffeeMachine()
	{
		sugarquant=1;
		waterquant=1;
		coffeequant=1;
		milkquant=1;	
	}
	public float getCoffee()
	{
		return 1.2f;
	}
	static coffeeMachine getInstance()
	{
		if(our==null)
		{
			our= new coffeeMachine();
		}
		return our;
		//Only 1 instance is created, if tried to create multiple insrance then it will return the OUR instance again & wont create a new instance
	}
}
public class singletonClassPrac {

	public static void main(String[] args) {
		coffeeMachine m1= coffeeMachine.getInstance();
		coffeeMachine m2= coffeeMachine.getInstance();
		coffeeMachine m3= coffeeMachine.getInstance();
        System.out.println(m1+" "+m2+" "+m3);
        if (m1==m2 && m2==m3) {
        	System.out.println("All are refering to a single same object");
        }

	}

}
