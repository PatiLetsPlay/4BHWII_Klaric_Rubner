package _08_Proxypattern_Drucker;

public class PrinterColor implements Printer{

    @Override
    public void Print(int pageCount)
    {
        System.out.printf("PrinterColor is printing %d pages", pageCount);
    }
}