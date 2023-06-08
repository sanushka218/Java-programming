public class SC63 {
    public static void main(String arg[])
    {
        String url="https://www.google.com";
        int length= url.length();
        int semi= url.indexOf(":");
        int dot= url.lastIndexOf(".", length-1);
        //System.out.println(semi);
        //System.out.println(dot);
        String protocol= url.substring(0, semi);
        //System.out.println(protocol);
        String type= url.substring(dot+1);
        //System.out.println(type);
        System.out.println(url);
        if(protocol.equals("http"))
        System.out.println("HYPER TEXT TRANSFER PROTOCOL");
        else if(protocol.equals("https"))
        System.out.println("HYPER TEXT TRANSFER PROTOCOL SECURE");
        else if(protocol.equals("ftp"))
        System.out.println("FILE TRANSFER PROTOCOL");
        switch (type) {
            case "com":
            System.out.println("COMMERCIAL");
                break;
            case "gov":
            System.out.println("GOVERNMENT");
              break;
            case "org":
            System.out.println("ORGANIZATIONAL");
              break;
            case "biz":
            System.out.println("BUSINESS");
              break;
            default:
            System.out.println("INVALID TYPE");
                break;
        }
        
        
    }
}
