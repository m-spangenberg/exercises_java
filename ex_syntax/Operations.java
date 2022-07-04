package exercise_01;
import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        // It's possible to declare but not initialize variables, just like in C.
        int y;
        // As long as the value you assign corresponds to the variables datatype, you'll be golden.
        y = 10;

        int z = 2;
        int b = 4;
        int o = 14;

        // You can't have the same variable repeat, eg: sum, sum, sum.
        int sum = z + b + o;
        System.out.println(sum);

        int sum1 = z * b * o;
        System.out.println(sum1);

        // It's possible to typecast like in C.
        double sum2 = (double)z / (double)b;
        System.out.println(sum2);

        double j = Math.pow(z, b);
        System.out.println(j);

        // Modulo is also supported without issue
        int x = 14 % 4;
        System.out.println(x);

        // it's possible to get input from users with `Scanners`
        // first you have to create a variable of datatype scanner and instantiate a Scanner object.
        Scanner user_input = new Scanner(System.in);
        String input_string = user_input.next();
        System.out.println(input_string);

        // get a boolean, you would use `.nextBoolean`, but it's better to use strings.
        Scanner user_input2 = new Scanner(System.in);
        boolean input_boolean = user_input2.nextBoolean();
        System.out.println(input_boolean);

        // to convert strings to datatypes, use parse.
//        int xx = Integer.parseInt(input_string);
    }

}
