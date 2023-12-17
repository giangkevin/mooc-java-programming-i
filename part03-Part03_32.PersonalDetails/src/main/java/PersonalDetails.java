
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int birthYear = 0;
        int sum  = 0;
        int index = 0;
        
        while (true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String [] parts = input.split(",");
            
            if(longestName.length() < parts[0].length()){
                longestName = parts[0];
            }
            
            sum += Integer.valueOf(parts[1]);
            index++;
        }
        System.out.println("Longest name: " +longestName);
        System.out.println("Average of the birth years: " + 1.0 * sum/index);
    }
}
