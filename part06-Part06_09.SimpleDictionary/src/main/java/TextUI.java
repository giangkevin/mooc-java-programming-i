import java.util.Scanner;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){
        
        while (true) {
            System.out.println("Command:");

            String command = this.scanner.nextLine();

            if (command.equals("end")){
                break;
            }  else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = this.scanner.nextLine();

                System.out.println("Translation: ");
                String translation = this.scanner.nextLine();

                dictionary.add(word, translation);

            }else if (command.equals("search")) {
                System.out.println("To be translated");
                String translated = scanner.nextLine();

                if(dictionary.translate(translated) == null){
                    System.out.println("Word " +translated + " was not found");
                }else{
                    System.out.println("Translation: " +dictionary.translate(translated));
                }
            }else{
                System.out.println("Unknown command");
            }
            
        }
        System.out.println("Bye bye!");
    }
}
