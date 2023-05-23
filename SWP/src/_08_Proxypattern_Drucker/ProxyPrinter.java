package _08_Proxypattern_Drucker;

public class ProxyPrinter implements Printer{
    private Printer _printer;
    @Override
    public void Print(int pageCount) throws Exception
    {
        if(pageCount <= 0)
        {
            throw new Exception("PageCount must be over 0");
        }
        else if(pageCount >= 1 && pageCount <= 49)
        {
            _printer = new PrinterColor();
        }
        else if(pageCount >= 50 && pageCount <= 99)
        {
            _printer = new PrinterBlackAndWhite();
        }
        else if(pageCount >= 100 && pageCount <= 499)
        {
            _printer = new PrinterLaser();
        }
        else if(pageCount >= 500)
        {
            throw new Exception("PageCount must be below 500");
        }

        _printer.Print(pageCount);
    }

}
