import java.util.ArrayList;

public class RecipeManager {
    
    private ArrayList<Recipe>recipes;

    public RecipeManager(){
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }

    public ArrayList<Recipe> getRecipes(){
        return this.recipes;
    }
}
