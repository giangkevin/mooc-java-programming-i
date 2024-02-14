import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private RecipeManager recipes;
    private Scanner scanner;
    
    public UserInterface(RecipeManager recipes, Scanner scanner){
        this.recipes = recipes;
        this.scanner = scanner;
    }

    public void start(){
        System.out.println("File to read:");
        String file = scanner.nextLine();
        
        this.readRecordsFromFile(file);

        while (true) {
            System.out.println("Commands:\n"
            + "list - lists the recipes\n"
            + "stop - stops the program\n"
            + "find name - searches recipes by name\n"
            + "find cooking time - searches recipes by cooking time\n"
            + "find ingredient - searches recipes by ingredient");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processCommand(command);
        }

    }

    public void readRecordsFromFile(String file){
        try(Scanner fileReading = new Scanner(Paths.get(file))){
            while(fileReading.hasNextLine()){
                String name = fileReading.nextLine();
                int time = Integer.valueOf(fileReading.nextLine());

                Recipe recipe = new Recipe(name, time);

                while (fileReading.hasNextLine()) {
                    ArrayList<String> ingredients = new ArrayList<>();

                    String ingredient = fileReading.nextLine();

                    if (ingredient.isEmpty()) {
                        break;
                    }

                    recipe.addIngredients(ingredient);

                }

                this.recipes.addRecipes(recipe);

            }
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }

    public void processCommand(String command){
        if (command.equals("list")) {
            this.recipes.listRecipes();

        }else if (command.equals("find name")) {
            System.out.println("Searched word:");
            String name = scanner.nextLine();
            this.recipes.findName(name);
        }else if (command.equals("find cooking time")){
            System.out.println("Max cooking time:");
            int time = Integer.valueOf(scanner.nextLine());
            this.recipes.findNameByCookingTime(time);
        }else if (command.equals("find ingredient")) {
            System.out.println("Ingredient:");
            String ingredient = scanner.nextLine();
            this.recipes.findNameByIngredients(ingredient);
        }
    }

}
