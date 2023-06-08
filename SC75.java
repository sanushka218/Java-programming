

public class SC75 {
    public static void main(String args[])
    {
       /*  String str="";
        int n,r;
        char c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n= sc.nextInt();
        while(n>0)
        {
            r=n%10;
            str=str+r;
            n=n/10;
        }
       // System.out.println(str);
        for(int i=str.length()-1;i>=0;i--)
        {
           c=str.charAt(i);
          // System.out.println(c);
          switch(c)
          {
            case '0':
            System.out.print("Zero ");
            break;
            case '1':
            System.out.print("One ");
            break;
            case '2':
            System.out.print("Two ");
            break;
            case '3':
            System.out.print("Three ");
            break;
            case '4':
            System.out.print("Four ");
            break;
            case '5':
            System.out.print("Five ");
            break;
            case '6':
            System.out.print("Six ");
            break;
            case '7':
            System.out.print("Seven ");
            break;
            case '8':
            System.out.print("Eight ");
            break;
            case '9':
            System.out.print("Nine ");
            break;
          }
        } 
        sc.close();
        */
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j>=i)
                System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
