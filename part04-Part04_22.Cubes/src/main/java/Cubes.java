
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String row = scanner.nextLine();

            if (row.equals("end")){
                break;
            }

            int number = Integer.valueOf(row);

            System.out.println(number*number*number);
        }
    }
}
