public class Container {

    //instance variables
    private Integer contents;

    // parameter free constructor
    public Container () {
        this.contents = 0;
    }

    // instance methods
    public int contains() {
        return this.contents;
    }

    public void add(int amount) {
        if (!(amount < 0)) {
            if (!(this.contents + amount > 100)) {
                this.contents += amount;
            } else {
                this.contents = 100;
            }
        }
    }

    public void remove(int amount) {
        if (!(amount < 0)) {
            if (!(this.contents - amount < 0)) {
                this.contents -= amount;
            } else {
                this.contents = 0;
            }
        }
    }

    public String toString() {
        return this.contents + "/100";
    }
}
