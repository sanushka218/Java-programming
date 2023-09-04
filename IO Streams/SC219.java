package filePra;
import java.io.*;
public class SC219 {

	public static void main(String[] args)throws Exception {
		
		try (FileInputStream fi=new FileInputStream("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\source1.txt"))
		{
			String str="";
			int y;
			while((y=fi.read())!=-1)
			     {
				    str=str+(char)y;
			     }
			str=str.toLowerCase();
			FileOutputStream fo= new FileOutputStream("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\source2.txt");
			byte b[]=str.getBytes();
			fo.write(b);
			fo.close();
			
		}

	}

}
