public class SC100 {
    static int min(int ... a)
    {
        int min=Integer.MAX_VALUE;
        for(int i:a)
        {
            if(i<min)
            min=i;
        }
        return min;
    }
    static int max(int ...a)
    {
        int max=0;
        for(int i:a)
        {
            if(i>max)
            max=i;
        }
        return max;
    }
    static int sum(int ...a)
    {
        int sum=0;
        for(int i:a)
        {
            sum+=i;
        }
        return sum;
    }
    //q min max of varargs, sum of va, discount
    public static void main(String args[])
    {
      System.out.println(min(10,3,2,99,5,8));
      System.out.println(max(10,3,2,99,5,8));
      System.out.println(sum(10,3,2,99,5,8));

    }
    
}
