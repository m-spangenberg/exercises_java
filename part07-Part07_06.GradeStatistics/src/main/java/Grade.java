import java.util.ArrayList;

public class Grade {
    
    // instance variables
    private ArrayList<Integer> grades;

    // parameter-free constructor
    public Grade() {
        this.grades = new ArrayList<>();
    }

    // accept grades 0 - 100, inclusive
    public void addGrade(int grade) {
        if (!(grade > 100 || grade < 0)) {
            this.grades.add(grade);
        }
    }

    // average of the point-total
    public double averageAll() {
        int gradeTotal = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            gradeTotal += this.grades.get(i);
        }
        return (double) gradeTotal / this.grades.size();
    }

    // average of only those who passed with
    // more than 50 points, inclusive
    public double averagePassing() {
        double passTotal = 0;
        int passStudents = 0;
        
        for (int i = 0; i < this.grades.size(); i++) {
            if (this.grades.get(i) >= 50) {
                passTotal += this.grades.get(i);
                passStudents++;
            }
        }
        return (double) passTotal / passStudents;
    }

    // percentage of submissions that passed
    public double percentagePassing() {
        double passStudents = 0;
        for (Integer grade : grades) {
            if (grade >= 50) {
                passStudents += 1;
            }
        }
        return ((passStudents / this.grades.size()) * 100);
    }

    public String starGenerator(int starCount) {
        String stars = "";
        for (int i = 0; i < starCount; i++) {
            stars += "*";
        }
        return stars;
    }

    // distribute points to grades
    public void gradeDistribution() {

        // create simple array to hold grades
        int[] gdist = {0, 0, 0, 0, 0, 0};

        // assign scores to grades
        for (Integer grade : grades) {
            if (grade >= 90) {
                gdist[5]++;
            } else if (grade >= 80) {
                gdist[4]++;
            } else if (grade >= 70) {
                gdist[3]++;
            } else if (grade >= 60) {
                gdist[2]++;
            } else if (grade >= 50) {
                gdist[1]++;
            } else {
                gdist[0]++;
            }
        }

        // print the distribution graph
        for (int i = 5; i >= 0; i--) {
            // this works in Java 11, curse you Java 8! ;_;
            // System.out.println(i + ": " + "*".repeat(gdist[i]));
            System.out.println(i + ": " + starGenerator(gdist[i]));
        }
    }
}
