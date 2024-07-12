import java.util.ArrayList;

public class Pipe <T>{

    private ArrayList<T>pipes;

    public Pipe() {
        this.pipes = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        this.pipes.add(value);
    }

    public T takeFromPipe(){
        if (isInPipe()) {
            T value = this.pipes.get(0);
            this.pipes.remove(value);
            return value;
        }
        return null;
    }

    public boolean isInPipe(){
        return !this.pipes.isEmpty();
    }
}
