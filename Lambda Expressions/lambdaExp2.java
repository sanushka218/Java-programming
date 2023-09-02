package lambdaExp;

interface mylambdaa{
	int add(int x, int y);
}
public class lambdaExp2 {

	public static void main(String[] args) {
		//mylambdaa m= (x,y)->{ return (x+y);};//Normal method
		//without return 
		mylambdaa m=(x,y)->x+y;
		System.out.println(m.add(4, 5));

	}

}
