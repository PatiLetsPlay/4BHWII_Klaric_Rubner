package _09_Strategypattern_Tickets;

public interface ItemStrategy {

    public String getItemCode();

    public double getItemPrice();

    public void setTaxAmount(double taxAmount);

    public String toString();
}
