package generics;

public class generic4 {

	static <T> void show(T list[])
	{
		for(T x:list)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		show(new String [] {"hi","my","name"});
		show(new Integer[] {10,20,30});

	}

}
