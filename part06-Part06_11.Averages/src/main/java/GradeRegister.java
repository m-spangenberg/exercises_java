
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> pointsTotal;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.pointsTotal = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.pointsTotal.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (!(this.grades.isEmpty())) {
            int gradedPupils = 0;
            int gradeTotal = 0;
            for (Integer grade : this.grades) {
                gradedPupils++;
                gradeTotal += grade;
            }
            return (double) gradeTotal / gradedPupils;
        } else {
            return -1;
        }
    }

    public double averageOfPoints() {
        if (!(this.pointsTotal.isEmpty())) {
            int gradedPupils = 0;
            int gradePointsTotal = 0;
            for (Integer points : this.pointsTotal) {
                gradedPupils++;
                gradePointsTotal += points;
            }
            return (double) gradePointsTotal / gradedPupils;
        } else {
            return -1;
        }
    }
}
