package throwVSthrows;
class NegativeDimensionException extends Exception{
	public String toString()
	{
		return("Dimension cant be Negative");
	}
}
public class throwThrows2 {

	static int area(int l, int b)throws NegativeDimensionException
	{
		if(l<0 || b<0)
			throw new NegativeDimensionException();
		return l*b;
	}
	static void meth1()throws NegativeDimensionException
	{
		System.out.println(area(10,-5));
	}
	public static void main(String[] args) {
		try {
		meth1();
		}
		catch(NegativeDimensionException e)
		{
			System.out.println(e);
		}

	}

}
