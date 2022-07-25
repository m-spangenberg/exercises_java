import java.util.ArrayList;

public class Stack {
    
    // set instance variables
    private ArrayList<String> stack;

    // constructor initializes new stack object
    public Stack() {
        this.stack = new ArrayList<>();
    }

    // tell us if the stack is occupied
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // add items to stack
    public void add(String value) {
        this.stack.add(value);
    }

    // remove items from stack (deque) and return value
    public String take() {
        String stackItem = this.stack.get(this.stack.size() - 1);
        this.stack.remove(stackItem);
        return stackItem;
    }

    // return contents of the stack as list
    public ArrayList<String> values() {
        return this.stack;
    }
}
