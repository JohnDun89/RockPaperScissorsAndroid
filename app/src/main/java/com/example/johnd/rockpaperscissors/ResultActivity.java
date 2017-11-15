package com.example.johnd.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView yourChoice;
    TextView computerChoice;
    TextView result;
    Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        yourChoice = findViewById(R.id.your_choice);
        computerChoice = findViewById(R.id.computer_choice);
        result = findViewById(R.id.result);
        returnButton = findViewById(R.id.return_button);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String yourHand = extras.getString("yourHand");
        String compHand = extras.getString("compHand");
        String actual = extras.getString("result");

        yourChoice.setText("You chose " + yourHand);
        computerChoice.setText("Computer chose " + compHand);
        result.setText(actual);
    }

    public void onPlayAgainButtonClicked(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
