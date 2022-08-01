public class Container {

    //instance variables

    // constructor

    // instance methods

    public void add(int amount) {
        if (!((amount + container1) > container1)) {
            container1 += amount;
        } else {
            container1 = 100;
        }
    }

    public void move(int amount) {
        if (!(container1 > container2)) {
            container2 += container1;
        } else {
            container1 = 100;
        }
    }

    public void remove(int amount) {
        if (!(amount > 100)) {
            container -= amount;
        } else {
            container = 0;
        }
    }
}
