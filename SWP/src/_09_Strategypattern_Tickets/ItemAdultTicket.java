package _09_Strategypattern_Tickets;

public class ItemAdultTicket implements ItemStrategy{
    private String code;
    private double price;
    private double startPrice = 15.99;
    private double taxAmount = 0.3;

    public ItemAdultTicket(String code){
        this.code = code;
    }

    @Override
    public String getItemCode() {
        return code;
    }

    @Override
    public double getItemPrice() {
        price = Math.round(startPrice * (1 + taxAmount));
        return price;
    }

    @Override
    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public String toString(){
        return "ItemCode: " + this.code + " ItemPrice: " + this.price + " StartPrice: " + this.startPrice + " TaxAmount: " + taxAmount;
    }

}
