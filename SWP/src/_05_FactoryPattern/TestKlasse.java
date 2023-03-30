package _05_FactoryPattern;

public class TestKlasse {
    public static void main(String[] args) throws Exception {
        EnvelopeFactory envelopeFactory = new EnvelopeFactory();

        //Possible Envelope Formats [A4; A5; A5]
        //Weight must be over 0 gramms!

        //create one Envelope and test it with:
        //Envelope envelopeName = envelopeFactory.getEnvelope("Format", weight[gramms]);
        //envelopeName.createEnvelope();

        Envelope envelopeA4 = envelopeFactory.getEnvelope(EnvelopeType.A4, 5);
        envelopeA4.createEnvelope();

        Envelope envelopeA5 = envelopeFactory.getEnvelope(EnvelopeType.A5, 2.5);
        envelopeA5.createEnvelope();

        Envelope envelopeA6 = envelopeFactory.getEnvelope(EnvelopeType.A6, 1.25);
        envelopeA6.createEnvelope();

        Envelope envelopeWrongWeight = envelopeFactory.getEnvelope(EnvelopeType.A4, -3);
        envelopeWrongWeight.createEnvelope();
    }
}