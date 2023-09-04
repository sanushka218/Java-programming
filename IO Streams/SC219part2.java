package filePra;
import java.io.*;
public class SC219part2 {

	public static void main(String[] args)throws Exception {
		
         FileInputStream fis1= new FileInputStream("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\source1.txt");
         FileInputStream fis2= new FileInputStream("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\source2.txt");
         FileOutputStream fo1= new FileOutputStream("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\destination.txt");
         
         SequenceInputStream sis= new SequenceInputStream(fis1,fis2);
         int b;
         while((b=sis.read())!=-1)
         {
        	 fo1.write(b);
         }
         fis1.close();
         fis2.close();
         fo1.close();
         sis.close();

	}

}
