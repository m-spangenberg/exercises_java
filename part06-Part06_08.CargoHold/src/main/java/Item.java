public class Item {
    
    // instance variables
    private String name;
    private int weight;

    // constructor
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    // instance methods
    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }

}
