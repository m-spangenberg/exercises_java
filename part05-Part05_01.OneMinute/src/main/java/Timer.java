public class Timer {
    
    private ClockHand seconds;
    private ClockHand centiseconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.centiseconds = new ClockHand(100);
    }

    public String toString() {
        return this.seconds + ":" + this.centiseconds;
    }

    public void advance() {
        this.centiseconds.advance();

        // using the logic paired with the object instance from ClockHand.java
        if (this.centiseconds.value() == 0) {
            this.seconds.advance();
        }
    }
}
