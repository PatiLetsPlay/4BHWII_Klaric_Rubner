package _08_Proxypattern_Drucker;

public class PrinterBlackAndWhite implements Printer{

    @Override
    public void Print(int pageCount)
    {
        System.out.printf("PrinterBlackAndWhite is printing %d pages", pageCount);
    }
}