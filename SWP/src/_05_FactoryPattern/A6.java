package _05_FactoryPattern;

public class A6 extends Envelope{
    private double weight;
    public A6(double weight){
        this.weight=weight;
    }
    @Override
    public double getWeight(){
        return this.weight;
    }
    @Override
    public void createEnvelope() {
        System.out.printf("\nEnvelopeType: A6, WeightOneSheet: %.2fg\n", weight);
    }
}
