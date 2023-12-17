
import java.util.Scanner;

public class SumOfNumbers {
    
    public static void main(String[] args) {
        int number=0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input==0){
                break;
            }
            number = number+input;
        }
        System.out.println("Sum of the numbers: "+ number);
    }
}
