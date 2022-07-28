import java.util.ArrayList;

public class Room {
    
    // instance variables
    private ArrayList<Person> persons;

    // parameterless constructor
    public Room() {
        this.persons = new ArrayList<>();
    }

    // instance methods
    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {

        // return null if empty
        if (persons.isEmpty()) {
            return null;
        }

        // create object reference to be returned
        Person referenceObject = this.persons.get(0);

        // find shortest person in the room
        for (Person person : this.persons) {
            if (person.getHeight() < referenceObject.getHeight()) {
                referenceObject = person;
            }
        }

        return referenceObject;
    }

    public Person take() {

        Person referenceObject = shortest();

        if (!(this.persons.isEmpty())) {
            this.persons.remove(referenceObject);
            return referenceObject;
        }

        return referenceObject;
    }
}
