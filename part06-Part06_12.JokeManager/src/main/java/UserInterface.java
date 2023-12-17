import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager joke, Scanner scanner){
        this.jokeManager = joke;
        this.scanner =  scanner;
    }

    public void start(){

        while(true){

            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String input = this.scanner.nextLine();

            if (input.equals("X")){
                break;
            }
            
            if (input.equals("1")){
                System.out.println("Write the joke to be added:");
                String jokes = this.scanner.nextLine();
                this.jokeManager.addJoke(jokes);

            }else if (input.equals("2")) {
                System.out.println(this.jokeManager.drawJoke());

            } else if (input.equals("3")){

                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            }
        }
    }

}
