
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Multiple Cards

        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Matt " + mattsCard);
        System.out.println("Paul " + paulsCard);
        paulsCard.addMoney(20.00);
        mattsCard.eatHeartily();
        System.out.println("Matt " + mattsCard);
        System.out.println("Paul " + paulsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50.00);
        System.out.println("Matt " + mattsCard);
        System.out.println("Paul " + paulsCard);
    }
}
