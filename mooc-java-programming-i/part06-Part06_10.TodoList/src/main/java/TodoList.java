import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;

    public TodoList(){
        this.tasks = new ArrayList<>();
    }

    public void add(String task){
        this.tasks.add(task);
    }

    public void print(){
        if (this.tasks.isEmpty()) {
            System.out.println("Empty List");
        }else{
            for (int i = 0; i < this.tasks.size(); i++){
            System.out.println(i+1 + ": " + this.tasks.get(i));
            }
        } 
    }

    public void remove(int number){
        if (this.tasks.isEmpty()) {
            System.out.println("Empty List");
        }else{
            this.tasks.remove(this.tasks.get(number-1));
        }
    }
}
