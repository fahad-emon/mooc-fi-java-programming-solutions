import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
        this.totalWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {

        if (suitcase.totalWeight() + this.totalWeight <= this.maximumWeight) {
            this.totalWeight += suitcase.totalWeight();
            this.suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }

}
