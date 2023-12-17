
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    
    public void addMeal(String meal){
        if(!(this.meals.contains(meal))){
            this.meals.add(meal);
        }
    }

    public void printMeals(){
        for (String meals : meals){
            System.out.println(meals);
        }
    }

    public void clearMenu(){
        this.meals.clear();
    }
}
