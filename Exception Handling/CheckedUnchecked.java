package checkedUnchecked;
import java.io.*;
public class CheckedUnchecked {
	static void fun1()
	{
		//CHECKED EXCEPTION
		//FileInputStream f1= new FileInputStream("My.txt");//compiler error:-Unhandled expn by FileNotFoundException
		
		//UNCHECKED EXCEPTION
//		try {
//		System.out.println(10/0);//unchecked expn bz compiler isn't forcing to correct it
//		}
//		catch(Exception e)
//            {
//	           System.out.println(e.getMessage());
//	           e.printStackTrace();
//           }
}
    static void fun2() {
    	fun1();
    }
    static void fun3()
    {
    	fun2();
    }
	public static void main(String[] args) {

		fun3();
	}

}
