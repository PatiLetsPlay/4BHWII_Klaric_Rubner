package _05_FactoryPattern;

public abstract class Envelope {
    /*
    FACTORY PATTERN: Erzeugen Sie Objekte die Briefumschläge
      A4, A5 und A6 abbilden. Jeder Umschlag hat ein Gewicht und soll zumindest ausgeben wie viel er wiegt und wie groß er ist. Der Anwender soll
      Briefumschläge mittels (A4,A5,A6) Stichwort erzeugen und beim Erzeugen ein Gewicht mit angeben können (<-main).
    */
    public double getWeight(){
        return 0;
    }
    void createEnvelope(){};
}
