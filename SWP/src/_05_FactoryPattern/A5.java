package _05_FactoryPattern;

public class A5 extends Envelope{
    public A5(double weight){
        super.setWeight(weight);
    }
    @Override
    public void createEnvelope() {
        System.out.printf("\nEnvelopeType: A5, WeightOneSheet: " + getWeight());
    }
}