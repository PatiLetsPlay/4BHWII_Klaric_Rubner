package _05_FactoryPattern;

public class EnvelopeFactory {
    public Envelope getEnvelope(String envelopeType, double weight) throws Exception {
        if(envelopeType == null){
            return null;
        }
        if( (envelopeType.equalsIgnoreCase("A4")) && (weight > 0) ){
            return new A4(envelopeType, weight);

        } else if( (envelopeType.equalsIgnoreCase("A5")) && (weight > 0) ){
            return new A5(envelopeType, weight);

        } else if( (envelopeType.equalsIgnoreCase("A6")) && (weight > 0) ){
            return new A6(envelopeType, weight);

        } else if (weight <= 0){
            throw new Exception("weight must be over 0 gramms!!");

        } else {
        throw new Exception("wrong Format!!");
        }
    }
}