package exercise_01;

public class Conditionals {
    public static void main(String[] args) {
        // let's set some variables
        int u = 10;
        int i = 20;
        int o = 30;

        // You can pass the boolean returned by a conditional as a variable
        // It is possible to chain conditionals

        // The AND operator `&&`
        boolean compared = u == i && o < i;
        System.out.println(compared);

        // The OR operator, `||`
        boolean compared2 = u == i || o < i;
        System.out.println(compared2);

        // The NOT operator, `!`
        boolean compared3 = !(u == i && o < i);
        System.out.println(compared3);

    }
}
