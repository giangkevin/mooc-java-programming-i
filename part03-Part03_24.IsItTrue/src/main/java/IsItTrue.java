
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string");
        
        String text = "true";
        String word = scanner.nextLine();

        if (word.equals(text)){
            System.out.println("You got it right!");
        }else{
            System.out.println("Try again!");
        }


    }
}
