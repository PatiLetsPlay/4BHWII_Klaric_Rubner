package _05_FactoryPattern;

public class EnvelopeFactory {
    public Envelope getEnvelope(String envelopeType, double weight) throws Exception {
        if(envelopeType == null){
            return null;
        }
        if( (envelopeType.equalsIgnoreCase("A4")) && (weight > 0) ){
            return new A4(weight);

        } else if( (envelopeType.equalsIgnoreCase("A5")) && (weight > 0) ){
            return new A5(weight);

        } else if( (envelopeType.equalsIgnoreCase("A6")) && (weight > 0) ){
            return new A6(weight);

        } else if (weight <= 0){
            System.out.println("\nError!");
            throw new Exception("weight must be over 0 gramms!!");

        } else {
            System.out.println("\nError!");
        throw new Exception("wrong Format!!");
        }
    }
}