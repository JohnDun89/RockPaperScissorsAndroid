package com.example.johnd.rockpaperscissors;

import android.content.Intent;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by JohnD on 15/11/2017.
 */

public class RockPaperScissorsGame {


    private Hand hand;
    private String player;
    Integer wins;
    Integer losses;

    Integer draws;

public RockPaperScissorsGame() {
    this.hand = hand;
    this.player = player;
    this.wins = 0;
    this.losses = 0;
    this.draws = 0;
    }

    public Hand selectRandomHand(){
        Hand[] hands = Hand.values();

        Random rand = new Random();
        int randomHand = rand.nextInt(hands.length);
        return hands[randomHand];

    }

    public String gameLogic(Hand player , Hand computer){

        if( (player == Hand.ROCK && computer == Hand.SCISSORS) ||
                (player == Hand.SCISSORS && computer == Hand.PAPER) ||
                (player == Hand.PAPER && computer == Hand.ROCK)){
            this.wins++;
            return "You win!";

        } else if(
                (player == Hand.ROCK && computer == Hand.PAPER) ||
                        (player == Hand.PAPER && computer == Hand.SCISSORS) ||
                        (player == Hand.SCISSORS && computer == Hand.ROCK)) {
                    this.losses++;
                    return "You lose!";

        } else {
            this.draws++;
            return "It's a draw.";
        }

    }

    public String returnNumberOfWinds(){
        return wins.toString();
    }

    public String returnNumberOfLosses(){
        return this.losses.toString();
    }

    public String returnNumberOfDraws(){
        return this.draws.toString();
    }

}
