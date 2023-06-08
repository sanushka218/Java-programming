import java.util.Scanner;

public class SC56 {
    public static void main(String arg[])
    {
        
        Scanner sc= new Scanner(System.in);
       /* //CHALLENGE 1
        System.out.println("enter the binary string");
        String a= sc.nextLine();
        if(a.matches("(0|1)*"))
            System.out.println("YES ITS A BINARY STRING");
        else System.out.println("NO ITS NOT A BINARY STRING"); */
        /* //CHALLENGE 2
        System.out.println("ENTER THE NUMBER");
        String b= sc.nextLine();
        if(b.matches("([0-9A-F])+"))
        System.out.println("YES ITS A HEXADECIMAL NUMBER");
        else System.out.println("NO ITS NOT A HEXADECIMAL NUMBER"); */
        //CHALLENGE 3
        System.out.println("ENTER THE DATE");
        String c= sc.nextLine();
        if(c.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"))
        System.out.println("CORRECT DATE");
        else System.out.println("NO");
        sc.close();
    }
}
