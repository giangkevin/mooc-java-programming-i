
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;

        int wins = 0;

        int losses = 0;


        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        ArrayList<Team> gameTeams = readRecordsFromFileTeams(file);



        for (Team item : gameTeams){


            if (item.getHomeName().equals(team)){
                if(item.getHomePoints() >= item.getVisitingPoints()){
                    wins++;
                }else {
                    losses++;

                }
                count++;
            }

            if (item.getVisitingName().equals(team)){
                if(item.getVisitingPoints() >= item.getHomePoints()){
                    wins++;
                }else{
                    losses++;
                }
                count++;
            }

        }
        System.out.println("Games: " +count);
        System.out.println("Wins: " +wins);
        System.out.println("Losses: " +losses);
        
    }

    public static ArrayList<Team> readRecordsFromFileTeams (String file){
        ArrayList<Team> teams = new ArrayList<>();


        try (Scanner readingFile = new Scanner(Paths.get(file))){
            while (readingFile.hasNextLine()){
                String line =  readingFile.nextLine();

                String [] parts = line.split(",");

                String nameHome = parts[0];

                String nameVisiting = parts[1];

                int homePoints = Integer.valueOf(parts[2]);

                int visitingPoints = Integer.valueOf(parts[3]);

                teams.add(new Team(nameHome, nameVisiting, homePoints, visitingPoints));


            }

        }catch (Exception e ){
                System.out.println(e.getMessage());
        }
        return teams;
    }

}
