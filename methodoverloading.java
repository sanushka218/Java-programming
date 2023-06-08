public class methodoverloading {
    static byte max(byte x,byte y)
    {
        return x>y?x:y;
    }
    static int max(int x, int y,int z)
    {
        if(x>y && x>z)
        return x;
        else if(y>x && y>z)
        return y;
        else return z;
    }
    static float max(float x, float y)
    {
        return x>y?x:y;
    }
    public static void main(String arg[])
    {
      System.out.println(max(2,5));
      System.out.println(max(4,19,3));
      System.out.println(max(5.86f, 99.8f));
    }
}
