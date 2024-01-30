import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;
    
    public GradeStatistics(){
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoints(int points){
        this.points.add(points);
        if(points >= 50){
            this.passingPoints.add(points);
        }
        this.grades.add(pointsToGrade(points));
    }

    public double averageOfPoints(){

        int sum = 0;

        for(int points : this.points){
            sum += points; 
        }

        return 1.0 * sum / this.points.size();
    }

    public double averageOfPassingPoints(){
        int sum = 0;

        for(int points : this.passingPoints){
            sum += points; 
        }
        
        return 1.0 * sum / this.passingPoints.size();
    }

    public String printPoints(){
        return "Point average (all): " + this.averageOfPoints();
    }

    public String printPassingPoints(){

        if (this.passingPoints.isEmpty()){
            return "Point average (passing): -";
        } else{
            return "Point average (passing): " + this.averageOfPassingPoints();
        }
    }

    public double passPercentage(){
        return 100.0 * this.passingPoints.size() / this.points.size();
    }
    public String printPercentage(){
        return "Pass percentage: " + this.passPercentage();
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

}
