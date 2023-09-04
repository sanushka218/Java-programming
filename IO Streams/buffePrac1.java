package filePra;
import java.io.*;
public class buffePrac1 {

	public static void main(String[] args)throws Exception
	{
      FileInputStream fis= new FileInputStream("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\test.txt");
      BufferedInputStream bis =new BufferedInputStream(fis);
      //System.out.println("file "+fis.markSupported());
      //System.out.println("buffer "+bis.markSupported());
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      bis.mark(8);
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      bis.reset();
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());

		
	}

}
