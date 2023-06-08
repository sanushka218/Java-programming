public class variableargu {
    static void show(int ... x)
    {
        for(int i:x)
        {
            System.out.println(i);
        }
    }
    static void showname(int i,String ... s)
    {
        for(String j:s)
        {
            System.out.println(i+"-> "+j);
            i++;
        }
  
    }
    public static void main(String arg[])
    {
       show();
      // show(10);
       show(10,20,30,40);
      // show(new int[]{9,8,6,00,66});
      showname(1, "anu", "shanu", "anika", "somiya", "bhavya");
    }
}
