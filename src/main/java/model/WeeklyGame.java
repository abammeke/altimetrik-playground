package model;

import java.util.List;

public class WeeklyGame {

    private static int wk =0;
    private String week;
    private List<Game> game;

    public WeeklyGame(List<Game> games){
        this.week = "Week" +" "+ (wk + 1);
        this.game = games;
    }

    public String getWeek() {
        return week;
    }

    public List<Game> getGame() {
        return game;
    }

    public void setGame(List<Game> game) {
        this.game = game;
    }


    public String toString(){

        return this.week + "\n"+ this.game;
    }
}
