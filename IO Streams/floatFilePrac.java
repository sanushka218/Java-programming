package filePra;
import java.io.*;
public class floatFilePrac {

	public static void main(String[] args)throws Exception
	{
		FileOutputStream fos=new FileOutputStream("C:/Users/Anushka Saxena/eclipse-workspace/IO/src/floatFile.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(5);
		dos.writeFloat(8.77f);
		dos.writeFloat(98.99f);
		dos.writeFloat(988.66f);
		dos.writeFloat(12.77f);
		dos.writeFloat(34.45f);
        dos.close();
        fos.close();
		FileInputStream fis=new FileInputStream("C:/Users/Anushka Saxena/eclipse-workspace/IO/src/floatFile.txt");
		DataInputStream dis=new DataInputStream(fis);
		int length=dis.readInt();
		float x;
		for(int i=0;i<length;i++)
		{
			x=dis.readFloat();
			System.out.println(x);
		}
         dis.close();
         fis.close();
	}

}
