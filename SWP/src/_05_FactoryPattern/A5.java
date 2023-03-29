package _05_FactoryPattern;

public class A5 extends Envelope{
    private double weight;
    public A5(double weight){
        this.weight=weight;
    }
    @Override
    public double getWeight(){
        return this.weight;
    }
    @Override
    public void createEnvelope() {
        System.out.printf("\nEnvelopeType: A5, WeightOneSheet: %.2fg\n", weight);
    }
}