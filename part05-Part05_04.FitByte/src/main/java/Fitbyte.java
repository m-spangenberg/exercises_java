public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {

        // find the maximum heart rate
        double maximumHeartRate = (206.3 - (0.711 * this.age));

        // calculate the target heart rate - The Karvonen method
        return ((maximumHeartRate - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate);
    }
}
