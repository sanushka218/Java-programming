package exceptionDemo;

public class MultipleNnestedTryCatch {

	public static void main(String[] args) {
//         int a[]= {30,20,10,40,0};
//         try {
//         int c=a[0]/a[2];
//         System.out.println(c);
//         
//         System.out.println(a[7]);
//         }
//         catch(ArithmeticException e)
//         {
//        	 System.out.println(e);
//         }
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//        	 System.out.println(e);
//         }
//         System.out.println("byyeee");
		
		//NestedtryNcatch
		int a[]= {30,20,10,40,0};
		try
		{
	         int c=a[0]/a[4];
	         System.out.println(c);
	         try {
	         System.out.println(a[3]);
	         }
	         catch(ArrayIndexOutOfBoundsException e)
             {
        	 System.out.println(e);
              }
		}
	      catch(ArithmeticException e)
	         {
        	 System.out.println(e);
	         }
		System.out.println("byee");
		
	}

}
