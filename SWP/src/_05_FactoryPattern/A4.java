package _05_FactoryPattern;

public class A4 extends Envelope{
    public A4(double weight){
        super.setWeight(weight);
    }
    @Override
    public void createEnvelope() {
        System.out.printf("\nEnvelopeType: A4, WeightOneSheet: " + getWeight());
    }
}
