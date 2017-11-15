package com.example.johnd.rockpaperscissors;

/**
 * Created by JohnD on 15/11/2017.
 */

public enum Hand {

    ROCK(1),
    PAPER(2),
    SCISSORS(3);


    private int value;

    Hand(int value) {
        this.value = value;
    }

    public  int getValue(){
        return this.value;
    }

}
