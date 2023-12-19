
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;
    private int totalWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
        this.totalWeight = 0;
    }

    public void addItem(Item item) {
        if (item.getWeight() + this.totalWeight <= this.maximumWeight) {
            this.items.add(item);
            this.totalWeight += item.getWeight();
        }
    }

    public int totalWeight() {
        return this.totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item largeItem = this.items.get(0);
        for (Item item : items) {
            if (item.getWeight() > largeItem.getWeight()) {
                largeItem = item;
            }
        }
        return largeItem;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (" + this.items.size() + " kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight + " kg)";
        }

        return this.items.size() + " items (" + this.totalWeight + " kg)";
    }
}
