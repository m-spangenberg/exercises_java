import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade grades = new Grade();
        UI ui = new UI(grades, scanner);
        ui.start();
    }
}
