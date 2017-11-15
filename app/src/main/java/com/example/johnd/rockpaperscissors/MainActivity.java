package com.example.johnd.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    RockPaperScissorsGame game;
    Button rock;
    Button paper;
    Button scissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rock = (Button)findViewById(R.id.rock);
        paper = (Button)findViewById(R.id.paper);
        scissors = (Button)findViewById(R.id.scissors);
        game = new RockPaperScissorsGame();

    }

    public void onRockButtonCLicked(View view){
        Log.d("mainAcitivity","onRockButtonPressed");
        Hand playerHand = Hand.ROCK;
        Hand computerhand = game.selectRandomHand();
        String result = game.gameLogic(playerHand,computerhand);

        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("result",result);
        intent.putExtra("yourHand","ROCK");
        intent.putExtra("compHand",computerhand.name());
        startActivity(intent);
    }


    public void onPaperButtonClicked(View view){
        Log.d("mainActivity", "onPaperButtonClicked");
        Hand playerHand = Hand.PAPER;
        Hand computerhand = game.selectRandomHand();
        String result = game.gameLogic(playerHand, computerhand);

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("yourHand","PAPER");
        intent.putExtra("compHand",computerhand.name());
        startActivity(intent);
    }

    public void onScissorsButtonClicked(View view){
        Log.d("mainActivity", "onScissorsButtonClicked");
        Hand playerHand = Hand.SCISSORS;
        Hand computerHand = game.selectRandomHand();
        String result = game.gameLogic(playerHand, computerHand);

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result",result);
        intent.putExtra("yourHand","SCISSORS");
        intent.putExtra("compHand", computerHand.name());
        startActivity(intent);
    }
}
