import java.util.ArrayList;

public class Hold {
    
    // instance variables 
    private int maxWeight;
    private ArrayList<Suitcase> hold;

    // constructor
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
    }

    // instance methods
    public void addSuitcase(Suitcase suitcase) {
        if ((maxWeight - totalWeight()) >= suitcase.totalWeight()) {
            this.hold.add(suitcase);
        }
    }

    @Override
    public String toString() {
        
        if (hold.isEmpty()) {
            return "no items (" + this.totalWeight() + " kg)";
        } else if (this.hold.size() < 2) {
            return this.hold.size() + " suitcase (" + this.totalWeight() + " kg)";
        } else {
            return this.hold.size() + " suitcases (" + this.totalWeight() + " kg)";
        }

    }

    public void printItems() {
        for (Suitcase suitcase : this.hold) {
            suitcase.printItems();
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        if (!(hold.isEmpty())) {
            for (Suitcase suitcase : this.hold) {
                totalWeight += suitcase.totalWeight();
            }
        }

        return totalWeight;
    }
}
