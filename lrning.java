class circle
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return Math.PI*2*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}
public class lrning {
    public static void main(String args[])
{
   circle c1= new circle();
   System.out.println(c1.area());
   System.out.println(c1.circumference());
   System.out.println(c1.perimeter());
}
}
