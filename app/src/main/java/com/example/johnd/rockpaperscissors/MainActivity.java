package com.example.johnd.rockpaperscissors;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


 public class MainActivity extends AppCompatActivity {

    RockPaperScissorsGame game;
    ImageButton rock;
    ImageButton paper;
    ImageButton scissors;

    public MainActivity(){

        game = new RockPaperScissorsGame();
     }

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissors = findViewById(R.id.scissors);

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

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if(item.getItemId() == R.id.action_about) {
            Toast.makeText(this, "About was clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.action_settings){
            onSettingsSelected(true);

            }
        return true;
    }

    public void onSettingsSelected(Boolean setting) {

        Bundle scoreBundle = new Bundle();
        scoreBundle.putString("win",game.returnNumberOfWinds());
        scoreBundle.putString("loss",game.returnNumberOfLosses());
        scoreBundle.putString("draw",game.returnNumberOfDraws());
        Intent scores = new Intent(MainActivity.this, SettingsActivity.class);
        scores.putExtras(scoreBundle);
        startActivity(scores);
    }
}
