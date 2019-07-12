package com.nfl.shedule.nflscheduleservice.service;

import model.Game;
import model.WeeklyGame;

import java.util.*;

public class GameSchedule {


    public GameSchedule(){}

    private String [] team1= {"Arizona Cardinals", "Baltimore Ravens", "Buffalo Bills",
            "Carolina Panthers", "Chicago Bears", "Cincinnati Bengals", "Cleveland Browns", "Dallas Cowboys",
            "Denver Broncos", "Detroit Lions", "Green Bay Packers", "Houston Texans", "Indianapolis Colts",
            "Jacksonville Jaguars", "Kansas City Chiefs", "Los Angeles Chargers", "Los Angeles Rams",
            "Miami Dolphins", "Minnesota Vikings", "New Orleans Saints", "New York Jets",
            "Oakland Raiders", "Philadelphia Eagles", "Pittsburgh Steelers", "San Francisco 49ers",
            "Seattle Seahawks", "Tampa Bay Buccaneers", "Tennessee Titans", "Washington Redskins" };

    private String [] team2= {"Arizona Cardinals", "Baltimore Ravens", "Baltimore Ravens", "Buffalo Bills",
            "Carolina Panthers", "Chicago Bears", "Cincinnati Bengals", "Cleveland Browns", "Dallas Cowboys",
            "Denver Broncos", "Detroit Lions", "Green Bay Packers", "Houston Texans", "Indianapolis Colts",
            "Jacksonville Jaguars", "Kansas City Chiefs", "Los Angeles Chargers", "Los Angeles Rams",
            "Miami Dolphins", "Minnesota Vikings", "New Orleans Saints", "New York Jets",
            "Oakland Raiders", "Philadelphia Eagles", "Pittsburgh Steelers", "San Francisco 49ers",
            "Seattle Seahawks", "Tampa Bay Buccaneers", "Tennessee Titans", "Washington Redskins" };

    int size = team1.length;

private String [] kk = new String[8];

    List<WeeklyGame> allGamesPlayed = new ArrayList<>();

    List<Game> gamesPlayed = new ArrayList<>();



    public List<Game> matchTeam(){
         for(int i=0; i< size; i++){
            for(int j=0; j<i; j++){
               gamesPlayed.add(new Game(team1[i], team1[j]));
            }
        }
        return checkMatch(gamesPlayed);
    }



    private List<Game> checkMatch(List<Game> g){
        List<Game> sorterd = new ArrayList<>();
        Map<String, String> teamCheck = new TreeMap<>();

        for(Game game: g){
            teamCheck.put(game.getTeam1(), game.getTeam2());
        }
        for(Map.Entry<String, String> e: teamCheck.entrySet()){
            sorterd.add(new Game(e.getKey(), e.getValue()));
        }

        return sorterd;
    }



    public List<WeeklyGame> getWeeklySchedule(){
        allGamesPlayed.add(new WeeklyGame(matchTeam()));
        return allGamesPlayed;
    }


}
