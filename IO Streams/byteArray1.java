package filePra;
import java.io.*;
public class byteArray1 {

	public static void main(String[] args)throws Exception
	{
      byte b[]= {'a','b','c','d','e','f','g','h'};
      ByteArrayInputStream bis= new ByteArrayInputStream(b);
      /*
       
      int x;
      while((x=bis.read())!=-1)
      {
    	  System.out.println((char)x);
      }
         String str= new String(bis.readAllBytes());
         System.out.println(str);
         */
       //  System.out.println(bis.markSupported());
         //BYTE O/P
         ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
         bos.write('a');
         bos.write('b');
         bos.write('c');
         byte c[]=bos.toByteArray();
         for(byte x:c)
         {
        	 System.out.println((char)x);
         }
         bos.writeTo(new FileOutputStream("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\test.txt"));
         bos.close();
         bis.close();
	}

}
