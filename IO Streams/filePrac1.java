package filePra;

import java.io.*;
//FILE O/P STREAM
public class filePrac1 {

	public static void main(String[] args) throws Exception {
		
		//try with resources
		try (FileOutputStream fos =new FileOutputStream("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\test.txt"))
		{
		    String str="Hello I am Anushka, currently learning JAVA I/O";
	
		    byte b[]=str.getBytes();
		    fos.write(b);
		    //fos.write(b, 0, 9);
		
//		catch(FileNotFoundException e)
//		{
//			System.out.println(e);
//		}
//		catch(IOException e)
//		{
//			System.out.println(e);
//
//		}
	}
	}

}
