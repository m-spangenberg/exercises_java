
public class HealthStation {

    private int weighing = 0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighing++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int personWeight = person.getWeight();
        person.setWeight(personWeight + 1);
    }

    public int weighings() {
        return this.weighing;
    }

}
