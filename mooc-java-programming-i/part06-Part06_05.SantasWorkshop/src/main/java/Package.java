import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        if (!gift.getName().isEmpty()) {
            this.gifts.add(gift);
        }
    }

    public int totalWeight() {
        int totalweight = 0;
        for (Gift gift : gifts) {
            totalweight += gift.getWeight();
        }

        return totalweight;
    }
}
