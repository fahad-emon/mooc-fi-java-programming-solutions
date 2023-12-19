import java.util.ArrayList;
    
public class Stack {
    private ArrayList<String>stack;

    public Stack(){
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty(){
        return this.stack.size() == 0;
    }

    public void add(String value){
        if (!this.stack.contains(value)) {
            this.stack.add(value);
        }
    }

    public ArrayList<String> values(){
        return this.stack;
    }

    public String take(){
        return this.stack.remove(this.stack.size() - 1);
    }
}
