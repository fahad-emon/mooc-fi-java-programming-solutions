
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass())  return false;
        Item item = (Item) obj;

        return name != null? name.equals(item.name) : item.name == null;
    }

    @Override
    public int hashCode() {
        return name != null? name.hashCode() : 0;
    }

}
