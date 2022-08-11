import java.util.ArrayList;

public class BirdDB {

    // instance variables
    private ArrayList<ArrayList<String>> birds;

    public BirdDB() {
        this.birds = new ArrayList<ArrayList<String>>();
    }

    public void addBird(String common, String latin) {
        
        boolean birdIsTheWord = false;
        
        for (ArrayList<String> bird : this.birds) {
            if (bird.get(0).contains(common)){
                birdIsTheWord = true;
            }
        }

        if (birdIsTheWord == false) {
            ArrayList<String> bird = new ArrayList<String>();
            bird.add(0 ,common);  // common english name
            bird.add(1, latin);  // latin name
            bird.add(2, "0"); // initial observations
            birds.add(bird);  // add bird to array of birds
        }     
        
    }
    
    public void observedBird(String name) {
        // append 1 observation the the bird species
        try {
            for (ArrayList<String> bird : this.birds) {
                if (bird.get(0).equals(name)) {
                    int observation = Integer.valueOf(bird.get(2)) + 1;
                    bird.set(2, Integer.toString(observation));
                }
            }
            
        } catch (Exception e) {
            System.out.println("Not a bird!");
        }
        
    }
    
    public void getBirds() {
        // print out all birds in the array
        for (ArrayList<String> bird : this.birds) {
            // Common Name (Latin Name): n observations
            System.out.println(bird.get(0) + "(" + bird.get(1) + "):" + bird.get(2) + " observations");
        }
    }
    
    public void getBird(String name) {
        // print bird that matches the common species name
        for (ArrayList<String> bird : this.birds) {
            if (bird.get(0).equals(name)) {
                // Common Name (Latin Name): n observations
                System.out.println(bird.get(0) + "(" + bird.get(1) + "):" + bird.get(2) + " observations");
            }
        }
    }
}
