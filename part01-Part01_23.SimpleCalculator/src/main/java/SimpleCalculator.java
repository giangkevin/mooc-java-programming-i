
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int result = first+second;
        int result1 = first-second;
        int result2 = first*second;
        double result3 = (double) first/second;

        System.out.println(first+" + "+second+" = "+result);
        System.out.println(first+" - "+second+" = "+result1);
        System.out.println(first+" * "+second+" = "+result2);
        System.out.println(first+" / "+second+" = "+result3);

        int third = 32;
        int forth = 25;
        third = 17;
        forth = third;

        System.out.println(third);


    }
}
