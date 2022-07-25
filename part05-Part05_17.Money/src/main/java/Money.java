
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    // create a new Money object
    public Money plus(Money addition) {
        // java garbage collector takes care of the old object
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    // return a new money object worth the difference of the object whose 
    // method was called and the object received as the parameter.
    public Money minus(Money decreaser) {

        int newAmount = ((this.euros * 100) + this.cents) - ((decreaser.euros * 100) + decreaser.cents);

        if (newAmount <= 0) {
            Money newMoney = new Money(0, 0);
            return newMoney;
        } else {
            int newEuro = newAmount / 100;
            int newCents = newAmount % 100;
            Money newMoney = new Money(newEuro, newCents);
            return newMoney;
        }

    }

    // perform likeness comparison between Money objects
    public boolean lessThan(Money compared) {
        
        // check if both live in the same address in memory
        if (this == compared) {
            return true;
        }

        // check if the object is an instance of type Money
        if (!(compared instanceof Money)) {
            return false;
        }

        // convert the object to a Money object
        Money comparedMoney = (Money) compared;

        if (this.euros < comparedMoney.euros) {
            return true;
        } else if (this.euros == comparedMoney.euros && this.cents < comparedMoney.cents) {
            return true;
        } else {
            return false;
        }
    }
}
