
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        BirdDB birds = new BirdDB();
        BirdUI ui = new BirdUI(birds, scan);
        ui.start();
    }

}
