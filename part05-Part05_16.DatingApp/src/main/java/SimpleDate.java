
public class SimpleDate {

    // private variables
    private int day;
    private int month;
    private int year;

    // class constructor
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // string override
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {

        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    // method advances the date by 1 day - Each month has 30 days
    public void advance() {
        
        // count up the day
        if (this.day < 30) {
            this.day++;

        // count up the month
        } else if (this.month < 12) {
            this.day = 1;
            this.month++;

        // count up the year
        } else {
            this.day = 1;
            this.month = 1;
            this.year++;
        }
    }

    // method advances the date by n number of days
    public void advance(int howManyDays) {

        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }

    // method returns a new date
    public SimpleDate afterNumberOfDays(int days) {
        // create a copy of the current date and advance time by n days
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

}
