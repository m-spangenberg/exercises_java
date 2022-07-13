public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    // increase the value instance variable's value by one.
    // does not allow values greater than 5.
    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }

    // decrease the value instance variable's value by one.
    // does not allow negative values.
    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    // return the value variable's value.
    public int value() {
        return this.value;
    }

    // return true if the instance variable value has the value five.
    public boolean full() {
        return this.value == 5;
    }
}
