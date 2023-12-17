
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nameOldest = "";
        int oldest = 0;
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }
            String [] parts = input.split(",");
            if (oldest < Integer.valueOf(parts[1])){
                oldest = Integer.valueOf(parts[1]);
                nameOldest = parts[0];
            }
        }
        System.out.println("Name of the oldest: " +nameOldest);
    }
}
