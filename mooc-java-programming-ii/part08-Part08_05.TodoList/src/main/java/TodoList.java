import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> todo;

    public TodoList(){
        this.todo = new ArrayList<>();
    }
    
    public void add(String task){
        this.todo.add(task);
    }

    public void remove(int number){
        this.todo.remove(number-1);
    }

    public void print(){
        for (int i = 0; i < this.todo.size(); i++) {
            System.out.println(i+1 + ": " + this.todo.get(i));
        }
    }
}
