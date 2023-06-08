public class sc97 {
   /*  static double area(double l, double w) {
        return (l * w);
    }

    static double area(double radius) {
        return (2 * 3.14 * radius);
    }

    static double area(Double a, Double b, Double h) {
        return ((a + b) * h) / 2;
    } */
    static int reverse(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        return sum;
    }
    static int[] reverse(int b[]) 
    {
        int t;
       for(int i=0;i<b.length/2;i++)
       {
         t=b[i];
         b[i]=b[b.length-i-1];
         b[b.length-i-1]=t;
       }
       return b;
    }
    public static void main(String arg[]) {
        //CHALLENGE 2
        System.out.println("The reverse of the number 786 is->"+reverse(786));
        int a[]={1,2,3,4,5};
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("The reverse of array is");
        a=reverse(a);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        //CHALLENGE 1
       /*  System.out.println("Area of a rectangle of dimension 12.8 x 7.66 is -> " + area(12.8, 7.66));
        System.out.println("Area of a circle of radius 7.89 is -> " + area(7.89));
        System.out.println("Area of trapezium of dimension 6 x 9 x 13 is -> " + area(6.0, 9.0, 13.0)); */
    }
}
