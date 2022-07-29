import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    // instance variable
    private ArrayList<String> jokes;

    // parameter free constructor
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    // add joke to jokes list
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    // return random joke from jokes list
    public String drawJoke() {
        if (!(this.jokes.isEmpty())) {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        } else {
            return "Jokes are in short supply.";
        }
    }

    // print all jokes
    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
