
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int largerNumber = 0;
        if (number1 > number2) {
            largerNumber = number1;
        } else {
            largerNumber = number2;
        }

        if (largerNumber > number3) {
            return largerNumber;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
