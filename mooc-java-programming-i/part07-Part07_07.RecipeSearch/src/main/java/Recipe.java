import java.util.ArrayList;

public class Recipe {

    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe() {
        this.recipeName = "";
        this.cookingTime = 0;
        this.ingredients = new ArrayList<>();
    }

    public Recipe(String recipeName, int cookingTime) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public void setName(String name) {
        this.recipeName = name;
    }

    public String getName() {
        return this.recipeName;
    }

    public void setTime(int time) {
        this.cookingTime = time;
    }

    public int getTime() {
        return this.cookingTime;
    }

    public void addIngreList(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public ArrayList<String> getIngreList() {
        return this.ingredients;
    }

    @Override
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookingTime + ".";
    }
}
