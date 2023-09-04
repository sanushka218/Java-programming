package filePra;
import java.io.*;
public class randomAccessFile1 {

	public static void main(String[] args)throws Exception {

		RandomAccessFile rf=new RandomAccessFile("C:\\Users\\Anushka Saxena\\eclipse-workspace\\IO\\src\\test.txt","rw");
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		rf.write('d');
        rf.skipBytes(3);
		System.out.println((char)rf.read());
        rf.seek(3);
		System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer()+2);
		System.out.println((char)rf.read());
        rf.close();
	}
	

}
