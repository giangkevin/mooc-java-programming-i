import java.util.Scanner;

public class UserInterface {
    private GradeStatistics grades;
    private Scanner scanner;

    public UserInterface(GradeStatistics grades, Scanner scanner){
        this.grades = grades;
        this.scanner = scanner;
    }

    public void start(){
        readPoints();
        System.out.println(this.grades.printPoints());
        System.out.println(this.grades.printPassingPoints());
        System.out.println(this.grades.printPercentage());
        printGradeDistribution();
    }

    public void readPoints(){
        while(true){
            System.out.println("Enter point totals, -1 stops:");
            String input  = this.scanner.nextLine();

            int number  = Integer.valueOf(input);

            if(number == -1 ){
                break;
            } else if (number < 0 || number > 100){
                continue;
            }

            this.grades.addPoints(number);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = grades.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

}
