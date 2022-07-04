package exercise_01;

import java.util.Scanner;

public class Nesting {
    public static void main(String[] args) {

        // A simple nested statement
        System.out.println("Enter your name");

        Scanner user_input = new Scanner(System.in);
        String input_string = user_input.nextLine();

        System.out.println(input_string);

    }
}
