
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String text = scanner.nextLine();
            if (text.equals("")){
                break;
            }

            String [] pieces = text.split(" ");

            for(String word : pieces){
                if (word.contains("av")){
                    System.out.println(word);
                }
            }
        }

    }
}
