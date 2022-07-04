package exercise_01;

public class Controlflow {
    public static void main(String[] args) {

        // An IF--ELSE-IF--ELSE statement
        String x = "hello";
        if (x.equals("test")) {
            System.out.println("x is test.");
        }else if (x.equals("hello")) {
            System.out.println("x is hello.");
        } else {
            System.out.println("x is not test.");
        }
    }
}
