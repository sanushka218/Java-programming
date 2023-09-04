package filePra;
//FILE I/P STREAM
import java.io.*;
public class filrPrac2 {

	public static void main(String[] args) throws Exception {
       
		try (FileInputStream fis =new FileInputStream("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\test.txt"))
		{
//	      byte b[]=new byte[fis.available()];
//	      fis.read(b);
//	      String str= new String (b);
//	      System.out.println(str);
			
			int x;
			do
			{
				x=fis.read();
				if(x!=-1)
				System.out.print((char)x);
			}while(x!=-1);
			System.out.println();
//			int y;
//			while((y=fis.read())!=-1)
//			{
//				System.out.print((char)y);
//
//			}
			/*
			 Similar for file reader
			 FileReader fr= new FileReader("path");
			 fr.read();
			 */
		}

	}

}
