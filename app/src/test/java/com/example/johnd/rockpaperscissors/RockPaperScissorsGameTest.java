package com.example.johnd.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JohnD on 15/11/2017.
 */
public class RockPaperScissorsGameTest {

    RockPaperScissorsGame game;

    @Before
    public void setUp() {
        game = new RockPaperScissorsGame();
    }

//    @Test
//    public void playerSelectsHand() {
//
//
//    }

    @Test
    public void selectRandomHand() {
        assertNotNull(game.selectRandomHand());
    }

    @Test
    public void gameLogicWin() {
        String actual = game.gameLogic(Hand.ROCK,Hand.SCISSORS);
        assertEquals("You win!",actual);
    }

    @Test
    public void gameLogicDraw(){
        String actual = game.gameLogic(Hand.PAPER, Hand.PAPER);
        assertEquals("It's a draw.",actual);
    }

    @Test
    public void gameLogicLose() {
        String actual = game.gameLogic(Hand.ROCK, Hand.PAPER);
        assertEquals("You lose!", actual);
    }

}