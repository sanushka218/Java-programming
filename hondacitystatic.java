
class hondacity{
	static int price=100;
	int a=1,b=1;
	
	static int onRoadPrice(String city) {
		switch(city) {
			case "delhi":
				return price+10;
			case "mumbai":
				return price+11;
			default: return 0;
		}
	}
}
public class hondacitystatic {

	public static void main(String[] args) {
		System.out.println("Know the price of car w/o creating the object");
		System.out.println(hondacity.price);
		System.out.println("Price for Delhi: "+ hondacity.onRoadPrice("delhi"));
		System.out.println("Price for Mumbai: "+ hondacity.onRoadPrice("mumbai"));
		
		System.out.println("*********************************************************");

		System.out.println("Getting details of car by creating the object");
		hondacity h1=new hondacity();
		System.out.println("FOR H1:-");
		System.out.println(h1.price);//Im accessing static var & methods in non static way
		System.out.println(h1.onRoadPrice("delhi"));
		System.out.println(h1.onRoadPrice("mumbai"));
		System.out.println("Now h1 modifying price to 200");
		h1.price=200;
		hondacity h2= new hondacity();
		System.out.println(h2.price);
		System.out.println(h2.onRoadPrice("delhi"));
		System.out.println(h2.onRoadPrice("mumbai"));
		System.out.println("again for h1 "+ h1.price);

		



		



	}

}
