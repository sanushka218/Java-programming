package throwVSthrows;

public class finallyDemo {

	static void meth1()throws Exception{
		try {
		throw new Exception();
		}
		finally {
			System.out.println("finallly");
		}//this will be executed even when there is exception or not
	}
	public static void main(String[] args) {
       try {
    	   meth1();
       }
       catch(Exception e){
    	   System.out.println(e);
    	   
       }

	}

}
