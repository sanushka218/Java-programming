public class arrays{

    public static void main(String arg[])
    {
        int [][]ay= new int [2][2];
        ay[0][0]=1;
        ay[0][1]=2;
        ay[1][0]=3;
        ay[1][1]=4;
        for(int i[]:ay)
        {
            for(int j:i)
            System.out.print(j+" ");
        }
    }
}