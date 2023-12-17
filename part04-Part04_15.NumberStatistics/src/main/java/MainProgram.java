
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

        Statistics A = new Statistics();
        Statistics B = new Statistics();
        Statistics C = new Statistics();
        

        while (true){
            System.out.println("Enter numbers:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1){
                break;
            } else{
                A.addNumber(input);

                if (input % 2 == 0 ){
                B.addNumber(input);
           
            } else if (input % 2 != 0){
                C.addNumber(input);
            } 
            }


        }
    
        System.out.println("Sum:" +A.sum());
        System.out.println("Sum of even numbers:" + B.sum());
        System.out.println("Sum of odd numbers:" + C.sum());
    }   
}
