package _09_Strategypattern_Tickets;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<ItemStrategy> items;

    public ShoppingCart(){
        this.items = new ArrayList<ItemStrategy>();
    }

    public void addItem(ItemStrategy item){
        this.items.add(item);
    }

    public void removeItem(ItemStrategy item){
        this.items.remove(item);
    }

    public void getShoppingCartItems(){
        int x = 0;
        for(ItemStrategy item : items){
            x++;
            System.out.println("Item" + x + ": " + item.ToString());
        }
    }
    public void calculateTotal(){
        double sum = 0;

        for(ItemStrategy item : items){
            sum += item.getItemPrice();
        }
        System.out.printf("\nPrice for Items in the Shoppingcart: %.2f", sum);
    }
}
