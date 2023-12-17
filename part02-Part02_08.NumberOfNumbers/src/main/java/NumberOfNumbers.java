
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ones = 0;

        while(true){

            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.next());

            if (number==0){
                break;
            }else{
                ones=ones+1;
            }
            
        }
        System.out.println("Number of numbers: " +ones);
    }
}
