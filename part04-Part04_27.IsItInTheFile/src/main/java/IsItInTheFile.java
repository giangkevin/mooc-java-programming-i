import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> list  = new ArrayList<>();

        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String row = fileScanner.nextLine();
                list.add(row);

            }

            if (list.contains(searchedFor)){
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        }catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
