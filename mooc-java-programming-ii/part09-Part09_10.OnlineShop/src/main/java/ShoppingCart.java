import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private List<Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    public void add(String product, int price) {
        if (this.shoppingCart.contains(new Item(product, 1, price))) {
            for (Item item : this.shoppingCart) {
                if (item.getProduct().equals(product)) {
                    item.increaseQuantity();
                }
            }
        }else{
            this.shoppingCart.add(new Item(product, 1, price));
        }
    }

    public int price() {
        int totalPrices = 0;
        for (Item item : this.shoppingCart) {
            totalPrices += item.price();
        }
        return totalPrices;
    }

    public void print() {
        for (Item item : this.shoppingCart) {
            System.out.println(item.toString());
        }
    }
}
