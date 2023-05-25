package _08_Proxypattern_Drucker;

public class Test {
    public static void main (String[] args)
    {
        Printer printer = new ProxyPrinter();
        try
        {
            //printer.Print(-20);
            //printer.Print(0);
            printer.Print(10);
            printer.Print(56);
            printer.Print(102);
            printer.Print(505);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
