
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        double sum = 0;

        while(true){
            System.out.println("Give a number");
            int input = Integer.valueOf(scanner.nextLine());

            if (input==0){
                break;
            }
            numbers = numbers + 1;
            sum = sum + input;
        }
        System.out.println("Average of the numbers: "+sum/numbers);

    }   
}
/*import java.util.Scanner;
 
public class AverageOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
 
            if (number == 0) {
                break;
            }
 
            sum = sum + number;
            count = count + 1;
        }
 
        System.out.println("Average of the numbers: " + (1.0 * sum / count));
    }
} */