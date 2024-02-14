import java.util.ArrayList;

public class RecipeManager {
    private ArrayList<Recipe> recipes;
    

    public RecipeManager(){
        this.recipes = new ArrayList<>();
    }

    public void addRecipes(Recipe recipe){
        this.recipes.add(recipe);
    }

    public void listRecipes(){
        for(Recipe recipes : this.recipes){
            System.out.println(recipes);
        }
    }

    public void findName(String name){
        for(Recipe recipes : this.recipes){
            if (recipes.getName().contains(name)) {
                System.out.println(recipes);
            }
        }
    }

    public void findNameByCookingTime(int time){
        for(Recipe recipes : this.recipes){
            if (recipes.getTime() <= time){
                System.out.println(recipes);
            }
        }
    }

    public void findNameByIngredients(String ingredients){
        for(Recipe recipes : this.recipes){
            if (recipes.getIngredients().contains(ingredients)) {
                System.out.println(recipes);
            }
        }
    }
}
