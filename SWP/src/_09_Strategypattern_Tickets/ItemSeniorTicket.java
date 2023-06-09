package _09_Strategypattern_Tickets;

public class ItemSeniorTicket implements ItemStrategy{
    private String code;
    private double price;
    private double startPrice = 10.99;
    private double taxAmount = 0.2;

    public ItemSeniorTicket(String code){
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
        this.taxAmount = taxAmount;
    }

    @Override
    public String ToString(){
        return "ItemCode: " + this.code + " ItemPrice: " + this.price + " StartPrice: " + this.startPrice + " TaxAmount: " + taxAmount;
    }

}
