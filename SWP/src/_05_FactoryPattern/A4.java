package _05_FactoryPattern;

public class A4 extends Envelope{
    private double weight;
    public A4(double weight){
        //this.envelopeType=envelopeType;
        this.weight=weight;
    }
    @Override
    public double getWeight(){
        return this.weight;
    }
    @Override
    public void createEnvelope() {
        System.out.printf("\nEnvelopeType: A4, WeightOneSheet: %.2fg\n" , weight);
    }
}
