package generics;

public class generics1 {

	public static void main(String[] args) {

//		Object obj=new String("hello");
//		obj =new Integer(10);
//		String str=(String)obj;
		Object obj[]=new Object[3];
		obj[0]="hi";
		obj[1]="bye";
		obj[2]=9;
		String s;
		int i=0;
		for(Object o:obj)
		{
			o=obj[i];
			s=(String)o;
			System.out.println(s);
			i++;
			
		}
		
	}

}
