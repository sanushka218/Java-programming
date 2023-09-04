package filePra;
import java.io.*;
public class charArrayReader1 {

	public static void main(String[] args)throws Exception {

		char b[]= {'a','b','c','d','e','f','g','h'};
		CharArrayReader cr=new CharArrayReader(b);
		int y;
		while((y=cr.read())!=-1)
		{
			System.out.println((char)y);
		}
		CharArrayWriter cw= new CharArrayWriter(5);
		cw.write('c');
		cw.write('h');
		cw.write('a');
		cw.write('r');
        char d[]= cw.toCharArray();
        for(char m:d)
        {
        	System.out.print(m);
        }
        cw.close();

	}

}
