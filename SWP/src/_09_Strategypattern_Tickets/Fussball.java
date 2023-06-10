package _09_Strategypattern_Tickets;

public class Fussball implements ItemStrategy{

    private String code;
    private double price;
    private double startPrice = 20;
    private double taxAmount = 0.5;

    public Fussball(String code){
        this.code = code;
    }

    @Override
    public String getItemCode() {
        return code;
    }

    @Override
    public double getItemPrice() {
        price = startPrice * (1 + taxAmount);
        return price;
    }

    @Override
    public void setTaxAmount(double taxAmount) {
        taxAmount = taxAmount;
    }

    @Override
    public String toString(){
        return "ItemCode: " + this.code + " ItemPrice: " + this.price + " StartPrice: " + this.startPrice + " TaxAmount: " + taxAmount;
    }
}
