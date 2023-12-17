public class Team {
    private String homeName, visitingName;
    private int homePoints, visitingPoints, gamesplayed, wins, losses;

    public Team (String homeName, String visitingName, int homePoints, int visitingPoints){
        this.homeName = homeName;
        this.visitingName = visitingName;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;

    }

    public String getHomeName(){
        return this.homeName;
    }

    public String getVisitingName(){
        return this.visitingName;
    }
    
    public int getHomePoints(){
        return this.homePoints;
    }

    public int getVisitingPoints(){
        return this.visitingPoints;
    }

    public int getGamesPlayed(){
        return gamesplayed += 1;
    }

    public int setWins(){
        return this.wins += 1;
    }

    public int setLosses(){
        return this.losses += 1;
    }

    public int getWins(){
        return this.wins;
    }

    public int getLosses(){
        return this.losses;
    }
}
