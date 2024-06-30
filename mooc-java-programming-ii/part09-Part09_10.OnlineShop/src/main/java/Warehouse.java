import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        return this.prices.containsKey(product) ? this.prices.get(product) : -99;
    }

    public int stock(String product) {
        return this.stocks.containsKey(product) ? this.stocks.get(product) : 0;
    }

    public boolean take(String product) {
        if (this.stocks.containsKey(product) && this.stocks.get(product) > 0) {
            int stock = this.stocks.get(product);
            stock--;
            this.stocks.put(product, stock);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> productsNames = new HashSet<>();
        for (String name : this.prices.keySet()) {
            productsNames.add(name);
        }
        return productsNames;
    }
}
