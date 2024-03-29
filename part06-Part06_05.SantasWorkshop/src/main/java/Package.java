import java.util.ArrayList;

public class Package {
    // instance variables
    private ArrayList<Gift> gifts;

    // parameterless constructor
    public Package() {
        this.gifts = new ArrayList<>();
    }

    // instance methods
    public void addGift(Gift gift) {
        gifts.add(gift);
        }

    public int totalWeight() {
        int totalWeight = 0;

        for (Gift gift : gifts) {
            totalWeight += gift.getWeight();
        }

        return totalWeight;
    }
}
