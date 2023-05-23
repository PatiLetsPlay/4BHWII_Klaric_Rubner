package _08_Proxypattern_Drucker;

public class PrinterLaser implements Printer{

    @Override
    public void Print(int pageCount)
    {
        System.out.printf("PrinterLaser is printing %d pages", pageCount);
    }
}