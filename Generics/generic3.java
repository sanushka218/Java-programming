package generics;
class ma<Integer>
{
	int data;
}
class ma2<T>extends ma<T>
{
	T data2;
}
public class generic3 {

	public static void main(String[] args) {
		ma<Integer>m1=new ma();
		m1.data=9;
		System.out.println(m1.data);
		ma2<String>m2=new ma2();
		m2.data2="hi";
		System.out.println(m2.data);
		System.out.println(m2.data2);
	}

}
