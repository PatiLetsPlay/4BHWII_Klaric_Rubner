package _08_Proxypattern_Drucker;

public class SchwarzWeißDrucker implements Drucker{
    @Override
    public void Drucken(int seitenanzahl)
    {
        System.out.println("Drucke Seitenanzahl: " + seitenanzahl);
    }
}
