package _08_Proxypattern_Drucker;

public class Test {
    public static void main (String[] args)
    {
        Drucker drucker = new ProxyDrucker();
        try
        {
            //drucker.Drucken(-20);
            //drucker.Drucken(0);
            //drucker.Drucken(10);
            //drucker.Drucken(56);
            //drucker.Drucken(102);
            drucker.Drucken(507);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
