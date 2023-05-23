package _08_Proxypattern_Drucker;

import java.util.ArrayList;
import java.util.List;

public class ProxyDrucker implements Drucker{
    Drucker drucker = new SchwarzWeißDrucker();
    @Override
    public void Drucken(int seitenanzahl) throws Exception
    {
        if(seitenanzahl <= 0)
        {
            throw new Exception("Nicht druckbare Seitenanzahl");
        }
        else if(seitenanzahl >= 50 && seitenanzahl <= 99)
        {
            throw new Exception("Nur Schwarz weiß druckbar");
        }
        else if(seitenanzahl >= 100 && seitenanzahl <= 499)
        {
            throw new Exception("Nur Laserdruck möglich");
        }
        else if(seitenanzahl >= 500)
        {
            throw new Exception("Nicht druckbar da zu viele Seiten");
        }

        drucker.Drucken(seitenanzahl);
    }

}
