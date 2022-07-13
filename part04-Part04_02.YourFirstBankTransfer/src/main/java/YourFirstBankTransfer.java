
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mAcc = new Account("Matthews account", 1000.00);
        Account msAcc = new Account("My account", 0);
        mAcc.withdrawal(100.00);
        msAcc.deposit(100.00);
        System.out.println(mAcc);
        System.out.println(msAcc);
    }
}
