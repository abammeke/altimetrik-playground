package model;

public class Game {

    private String team1;
    private String team2;

    public Game(String team1, String team2){
        this.team1 = team1;
        this.team2 = team2;
    }


    public String toString(){
        return team1+" vs "+ team2+"\n";
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }
}
