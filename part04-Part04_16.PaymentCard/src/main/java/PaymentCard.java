public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        // reduce card balance by Euro 2.60.
        // but only if there is available funds.
        double affordableMeal = 2.60;
        if (this.balance - affordableMeal >= 0) {
            this.balance = this.balance - affordableMeal;
        }
    }

    public void eatHeartily() {
        // reduce card balance by Euro 4.60.
        // but only if there is available funds.
        double heartyMeal = 4.60;
        if (this.balance - heartyMeal >= 0) {
            this.balance = this.balance - heartyMeal;
        }
    }

    public void addMoney(double amount) {
        // top up the card, a max. of 150 Euros is allowed.

        if (amount > 0) {
            if ((this.balance + amount) > 150.00) {
                this.balance = 150.00;
            } else if (this.balance > 0) {
                this.balance = this.balance + amount;
            }
        }
    }

    public String toString() {
        // return the card's balance in Euros.
        return "The card has a balance of " + this.balance + " euros";
    }
}
