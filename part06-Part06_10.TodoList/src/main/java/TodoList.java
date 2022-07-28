import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        int i = 1;
        for (String string : list) {
            System.out.println(i + ": " + string);
            i++;
        }
    }

    public void remove(int number) {
        list.remove(number - 1);
    }
}
