package _09_Strategypattern_Tickets;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        ItemStrategy ticketChild = new ItemChildTicket("1111");
        ItemStrategy ticketAdult = new ItemAdultTicket("2222");
        ItemStrategy ticketSenior = new ItemSeniorTicket("3333");
        ItemStrategy fussball = new Fussball("4444");

        cart.addItem(ticketChild);
        cart.calculateTotal();

        cart.addItem(ticketAdult);
        cart.calculateTotal();

        cart.addItem(ticketSenior);
        cart.calculateTotal();

        cart.addItem(fussball);
        cart.calculateTotal();

        System.out.println("\n");
        cart.getShoppingCartItems();
    }

}
