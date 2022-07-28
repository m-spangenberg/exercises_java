import java.util.ArrayList;

public class Suitcase {

    // instance variables
    private int maxWeight;
    private ArrayList<Item> items;
    
    // constructor
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    // instance methods
    public void addItem(Item item) {
        if ((maxWeight - totalWeight()) >= item.getWeight()) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {

        if (items.isEmpty()) {
            return "no items (" + this.totalWeight() + " kg)";
        } else if (this.items.size() < 2) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        if (!(items.isEmpty())) {
            for (Item item : this.items) {
                totalWeight += item.getWeight();
            }
        }

        return totalWeight;
    }

    public Item heaviestItem() {

        // if the suitcase isn't empty do the following
        if (!(items.isEmpty())) {

            // give ourselves a reference point to start from
            Item referenceItem = this.items.get(0);

            // compare items in the suitcase
            for (Item item : items) {
                if (item.getWeight() > referenceItem.getWeight()) {
                    referenceItem = item;
                }
            }

            // return the heaviest of these items
            return referenceItem;
        }

        // otherwise return null
        return null;
    }
}