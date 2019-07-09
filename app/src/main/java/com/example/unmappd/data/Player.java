package com.example.unmappd.data;

import java.util.ArrayList;

/**
 * Class Player - Represents a player of the game that is defined by his name and his score.
 *
 * @author Franziska Barckmann
 */
public class Player {

    private String name;
    private int score;
    private ArrayList<Integer> guesses = new ArrayList<>();

    /**
     * Constructor.
     * @param name - name as a String
     * @param score - score as an int
     */
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score){

        this.score = score;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public void addGuess(Integer distance){
        guesses.add(distance);
    }

    public void removeGuesses(){
        guesses.clear();
    }
}
