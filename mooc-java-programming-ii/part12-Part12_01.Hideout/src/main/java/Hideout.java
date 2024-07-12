import java.util.ArrayList;

public class Hideout<T> {

    private ArrayList<T>values;

    public Hideout(){
        this.values = new ArrayList<>();
    }

    public void putIntoHideout(T toHide){
        if (!this.values.contains(toHide)) {
            this.values.add(toHide);
        }
    }

    public T takeFromHideout(){
        if (this.values.isEmpty()) {
            return null;
        }

        T val = this.values.get(this.values.size()-1);
        this.values.remove(this.values.size()-1);
        return val;
    }

    public boolean isInHideout(){
        return !this.values.isEmpty();
    }
}
