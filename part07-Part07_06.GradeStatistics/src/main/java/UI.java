import java.util.Scanner;

public class UI {
     
    // instance variables
    private Scanner scanner;
    private Grade grades;

    // constructor
    public UI(Grade grades, Scanner scanner) {
        this.scanner = scanner;
        this.grades = grades;
    }

    // instance methods
    public void start() {

        System.out.println("Enter point totals, -1 stops:");

        while (true) {

            int number = Integer.valueOf(this.scanner.nextLine());


            if (!(number == -1)) {
                this.grades.addGrade(number);
            } else {
                break;
            }
        }

        System.out.println("Point average (all): " + (double) this.grades.averageAll());
        System.out.println("Point average (passing): " + (double) this.grades.averagePassing());
        System.out.println("Pass percentage: " + (double) this.grades.percentagePassing());
        System.out.println("Grade distribution: ");
        
    }
}
