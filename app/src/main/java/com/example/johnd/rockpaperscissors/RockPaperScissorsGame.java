package com.example.johnd.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by JohnD on 15/11/2017.
 */

public class RockPaperScissorsGame {

    private Hand hand;
    private String player;

public RockPaperScissorsGame() {
    this.hand = hand;
    this.player = player;
    }

    public void playerSelectsHand(){

    }

    public Hand selectRandomHand(){
        Hand[] hands = Hand.values();

        Random rand = new Random();
        int randomHand = rand.nextInt(hands.length);
        return hands[randomHand];

    }

    public String gameLogic(Hand player , Hand computer){

        if( (player == Hand.ROCK && computer == Hand.SCISSORS) ||
                (player == Hand.SCISSORS && computer == Hand.ROCK) ||
                (player == Hand.SCISSORS && computer == Hand.PAPER)){
            return "You win!";
        } else if(
                (player == Hand.ROCK && computer == Hand.PAPER) ||
                        (player == Hand.PAPER && computer == Hand.SCISSORS) ||
                        (player == Hand.SCISSORS && computer == Hand.ROCK)) {
                    return "You lose!";

        } else {
            return "It's a draw.";
        }

    }

}
