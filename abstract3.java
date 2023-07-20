
//abstarct shape- no property, A perimeter &area yes,
//concrete class- circle & reactangle
 //overrding & dispatch
abstract class shape{
	abstract int perimeter();
	abstract int area();
}
class rectangle extends shape{
	public int l;
	public int b;
	@Override
	public int perimeter()
	{
		return 2*(l+b);
	}
	@Override
	public int area()
	{
		return l*b;
	}
}
class circle extends shape{
	public int radius;
	@Override
	public int perimeter()
	{
		return 2*3*radius;
	}
	public int area()
	{
		return 3*radius*radius;
	}
}
public class abstract3 {

	public static void main(String[] args) {
		rectangle r= new rectangle();
		r.l=5;
		r.b=3;
		System.out.println("Perimeter- "+r.perimeter());
		System.out.println("Area- "+r.area());
		circle c= new circle();
		c.radius=4;
		System.out.println("Perimeter- "+c.perimeter());
		System.out.println("Area- "+c.area());
		
		
	}

}
