package _05_FactoryPattern;

public class A5 extends Envelope{
    private String envelopeType;
    private double weight;

    public A5(String envelopeType, double weight){
        this.envelopeType=envelopeType;
        this.weight=weight;
    }

    @Override
    public double getWeight(){
        return this.weight;
    }

    @Override
    public String getEnvelopeType(){
        return this.envelopeType;
    }

    @Override
    public void createEnvelope() {
        System.out.printf("\nEnvelopeType: %s, WeightOneSheet: %.2fg\n", envelopeType , weight);
    }
}