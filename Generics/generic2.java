package generics;
/*
class Data<T>
{
	private T obj;
	public void setMethod(T o)
	{
		obj=o;
	}
	public T getMethod()
	{
		return obj;
	}
}
*/
@SuppressWarnings("unchecked")
class Myarray<T>
{
	T A[]=(T[])new Object[10];
	int length=0;
	public void append(T v)
	{
		A[length++]=v;
	}
	public void display()
	{
		for(int i=0;i<length;i++)
		{
			System.out.println(A[i]);
		}
	}
}
public class generic2 {

	public static void main(String[] args) {
//     Data<Integer>d=new Data<>();
//     d.setMethod(10);//autoboxing
//     System.out.println(d.getMethod());

		Myarray<Integer>y=new Myarray();
		y.append(1);
		y.append(2);
		y.append(3);
		y.append(4);
		y.display();
	}

}
