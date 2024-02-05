import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipeManager recipeManager;
    private ArrayList<String> recipesInfo;

    public UserInterface(Scanner scanner, RecipeManager recipeManager) {
        this.scanner = scanner;
        this.recipeManager = recipeManager;
        this.recipesInfo = new ArrayList<>();
    }

    public void start() {
        System.out.print("File to read: ");
        String fileName = this.scanner.nextLine();
        System.out.println();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            readFile(fileReader);
            PrintCmd();
            userCmd();
        } catch (Exception e) {
            System.out.println("Error: " + fileName);
        }
    }

    public void readFile(Scanner fileReader) {

        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            if (line.isEmpty()) {
                createRecipes();
                recipesInfo.clear();
                continue;
            }
            recipesInfo.add(line);
        }
        createRecipes();
        recipesInfo.clear();

    }

    public void createRecipes(/* ArrayList<String> recipesInfo */) {
        String name = recipesInfo.get(0);
        int time = Integer.valueOf(recipesInfo.get(1));
        Recipe recipe = new Recipe(name, time);
        for (int i = 0; i < recipesInfo.size(); i++) {
            recipe.addIngreList(recipesInfo.get(i));
        }
        recipeManager.addRecipe(recipe);
    }

    public void PrintCmd() {
        System.out.println();
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    public void printREcipeList() {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipeManager.getRecipes()) {
            System.out.println(recipe);
        }
    }

    public void srcRecipeName() {
        System.out.print("Searched word: ");
        String searchWord = this.scanner.nextLine();
        // System.out.println();
        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipeManager.getRecipes()) {
            if (recipe.getName().contains(searchWord)) {
                System.out.println(recipe);
            }
        }
    }

    public void srcCookingTime() {
        System.out.print("Max cooking time: ");
        int srcTime = Integer.valueOf(this.scanner.nextLine());
        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipeManager.getRecipes()) {
            if (recipe.getTime() <= srcTime) {
                System.out.println(recipe);
            }
        }
    }

    public void srcIngredient() {
        System.out.print("Ingredient: ");
        String srcWord = this.scanner.nextLine();
        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipeManager.getRecipes()) {
            ArrayList<String> IngredientList = recipe.getIngreList();
            for (String ingredient : IngredientList) {
                if (ingredient.equals(srcWord)) {
                    System.out.println(recipe);
                    break;
                }
            }
        }
    }

    public void userCmd() {
        while (true) {
            System.out.println();
            System.out.print("Enter command: ");
            String cmd = this.scanner.nextLine();
            System.out.println();
            if (cmd.equals("stop")) {
                break;
            } else if (cmd.equals("list")) {
                printREcipeList();
            } else if (cmd.equals("find name")) {
                srcRecipeName();
            } else if (cmd.equals("find cooking time")) {
                srcCookingTime();
            } else if (cmd.equals("find ingredient")) {
                srcIngredient();
            }
        }
    }
}
