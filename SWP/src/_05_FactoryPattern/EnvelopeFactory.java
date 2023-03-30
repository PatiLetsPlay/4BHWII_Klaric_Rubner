package _05_FactoryPattern;

public class EnvelopeFactory {
    public Envelope getEnvelope(EnvelopeType envelopeType, double weight) throws Exception {
        if (envelopeType == null) {
            return null;
        }
        if ((envelopeType == envelopeType.A4) && (weight > 0)) {
            return new A4(weight);

        } else if ((envelopeType == envelopeType.A5) && (weight > 0)) {
            return new A5(weight);

        } else if ((envelopeType == envelopeType.A6) && (weight > 0)) {
            return new A6(weight);

        } else {
            System.out.println("\nError!");
            throw new Exception("weight must be over 0 grams!!");
        }
    }
}