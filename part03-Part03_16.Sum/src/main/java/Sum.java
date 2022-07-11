
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }

    // a methods that returns the sum of an arraylist
    public static int sum(ArrayList<Integer> numbers) {
        int total = 0;

        for (Integer i : numbers) {
            total += i;
        }
        
        return total;
    }
}
