
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.Items.add(Item);
    }

    public int totalWeight() {
        // int summa = 0;
        // int indeksi = 0;
        // while (indeksi < this.Items.size()) {
        //     summa += this.Items.get(indeksi).getWeight();
        //     indeksi++;
        // }
        // return summa;
        return this.Items.stream().mapToInt(item -> item.getWeight()).sum();
    }

    public void printItems() {
        // int indeksi = 0;
        // while (indeksi < this.Items.size()) {
        //     Item t = this.Items.get(indeksi);
        //     System.out.println(t);
        //     indeksi++;
        // }
        this.Items.stream().forEach(item -> System.out.println(item));
    }

    public Item heaviestItem() {
        if (this.Items.isEmpty()) {
            return null;
        }

        return this.Items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
