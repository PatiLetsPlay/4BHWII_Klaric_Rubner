package _05_FactoryPattern;

public class A6 extends Envelope{
    public A6(double weight){
        super.setWeight(weight);
    }
    @Override
    public void createEnvelope() {
        System.out.printf("\nEnvelopeType: A4, WeightOneSheet: " + getWeight());
    }
}
