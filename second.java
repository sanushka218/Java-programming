package second;
class supper{
    public void display()
    {
        System.out.println("Super class display ");
    }
}
class Subclass extends supper{
	@Override
    public void display()
    {
        System.out.println("Sub class display");
    }
}
public class second {

	public static void main(String[] args) {
		supper s= new Subclass();
	    s.display();
	    //Subclass t= new Subclass();
	    //t.display();

	}

}
