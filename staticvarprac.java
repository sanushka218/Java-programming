
class hi{
	static int x=10;
	int y=20;
	void show()
	{
		System.out.println(x+" "+y);
	}
	static void display()
	{
		System.out.println(x);
	}
}
public class staticvarprac {

	public static void main(String[] args) {
          hi h1= new hi();
          h1.x=90;
          h1.y=99;
          h1.show();
          
          hi h2= new hi();
          h2.x=900;
          h2.show();     
	}

}
