import java.util.Scanner;

class third {
    //STRINGS
    public static void main(String arg[])
    {  
       Scanner sc= new Scanner(System.in);
       System.out.println("ENTER THE GMAIL ID");
       String st1= sc.nextLine();
       int i=st1.indexOf('@');
       String username= st1.substring(0, i);
       String domain= st1.substring(i+1);
       boolean x= domain.startsWith("gmail");
       if(x==true)
       {
       System.out.println("THE DOMAIN IS OF GMAIL, U CAN CONTINUE");
       System.out.println("& the username is "+ username);
       }
       else System.out.println("SORRY UR DOMAIN DOESNT BELONG TO GMAIL, U CAN GO BYE");
       sc.close();
        //VERY IMP CHECK GMAIL ID VALID OR NOT
        /* String s1="annuu8812@gmail.com";
       System.out.println(s1.matches("[a-z]*[0-9]*@gmail.*"));;
         */
      
    }
    
    
}
