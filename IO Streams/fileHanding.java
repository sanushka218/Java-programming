package filePra;
import java.io.*;
public class fileHanding {

	public static void main(String[] args) throws Exception
	{
       File f= new File("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src");
       System.out.println(f.isDirectory());
//       String list[]= f.list();
//       for(String y:list)
//       {
//    	   System.out.println(y);
//       }
       /*
       File list2[]=f.listFiles();
       for(File x:list2)
       {
    	   System.out.println(x.getName());
    	   System.out.println(x.getPath());
    	   System.out.println(x.getParent());
       }
       */
       File fi= new File("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\data.txt");
//       fi.setReadOnly();
//       FileOutputStream fos=new FileOutputStream("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\data.txt");
//       fos.write('a');
       fi.setWritable(true);
       FileOutputStream fos=new FileOutputStream("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\data.txt");
       fos.write('a');
	}

}
