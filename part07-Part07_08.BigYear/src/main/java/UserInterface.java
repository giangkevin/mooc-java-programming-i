import java.util.Scanner;

public class UserInterface {
    private BirdManager birdManager;
    private Scanner scanner;



    public UserInterface(BirdManager birdManager, Scanner scanner ){
        this.birdManager = birdManager;
        this.scanner = scanner;
    }

    public void start(){
        while (true) {
            System.out.println("?");
            String command  = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }
            processCommand(command);
        }

    }

    public void processCommand(String command){
        if (command.equals("Add")) {
            System.out.println("Name:");
            String name = scanner.nextLine();

            System.out.println("Name in Latin:");
            String latinName = scanner.nextLine();

            Bird bird = new Bird(name, latinName);

            birdManager.addBird(bird);

        }else if (command.equals("Observation")) {
            System.out.println("Bird?");
            String bird = scanner.nextLine();

            birdManager.addObservations(bird);
        }else if (command.equals("One")) {
            System.out.println("Bird?");
            String bird = scanner.nextLine();

            birdManager.printOneBird(bird);
        }else if (command.equals("All")) {
            birdManager.printAllBirds();
        }
    }
}
