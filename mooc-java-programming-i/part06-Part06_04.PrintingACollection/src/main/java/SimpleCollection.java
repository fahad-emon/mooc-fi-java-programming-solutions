
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;
    private int element;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        if (!element.isEmpty()) {
            this.elements.add(element);
            this.element++;
        }
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        String people = "";
        for (String personName : elements) {
            people += "\n" + personName;
        }

        if (this.element == 1) {
            return "The collection " + this.name + " has " + this.element + " element:" + people;
        }

        return "The collection " + this.name + " has " + this.element + " elements:" + people;
    }
}
