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

        System.out.println("Point average (all): " + this.grades.averageAll());

        if (this.grades.averagePassing() != 0) {
            System.out.println("Point average (passing): " + this.grades.averagePassing());
        } else {
            System.out.println("Point average (passing): -");
        }
        
        System.out.println("Pass percentage: " + this.grades.percentagePassing());
        System.out.println("Grade distribution: ");
        this.grades.gradeDistribution();
    }
}
