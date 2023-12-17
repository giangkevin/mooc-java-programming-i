
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();


        try (Scanner readingFile = new Scanner(Paths.get(input))){

            while (readingFile.hasNextLine()){
                String row = readingFile.nextLine();

                System.out.println(row);
            }
        } catch (Exception e){
            System.out.println("Reading the file failed");
        }
      
    }
}
