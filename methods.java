public class methods {
    static String anu(int a, String y)
  {
      String ans= y.substring(a);
      return ans;
  }
    /* static int max(int x, int y)
    {
        if(x>y)
        return x;
        else return y;
    } */
   /*  int max(int x, int y)
    {
        if(x>y)
        return x;
        else return y;
    }  */

   /*  static void update(int adr[])
    {
        adr[0]=77;//adr holding the same address of arr array
    } */
    //Q CREATE A METHOD THAT RETURN A SUBSTRING
    public static void main(String arg[])
    {
        String y="Anushka.Saxena";
    System.out.println(y);
    int a= y.indexOf(".");
    y=anu(a+1,y);
    System.out.println(y);
        //int a=10,b=15;

       /*  int arr[]={2,7,4,9};
        update(arr);//passing refrence of an object to a method
        for(int x:arr)
        {
            System.out.println(x);
        } */

       // System.out.println(max(a,b));
      // methods mp= new methods();
       //System.out.println(mp.max(a, b));
    }
}
