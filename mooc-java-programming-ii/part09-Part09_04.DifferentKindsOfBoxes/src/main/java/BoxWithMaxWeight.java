import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private int Capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        this.Capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() <= this.Capacity) {
            items.add(item);
            this.Capacity -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

    
}
