
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.sum = 0;
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        }
        
        return ((double) this.sum / this.count);

    }
}
