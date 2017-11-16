package com.example.johnd.rockpaperscissors;

import android.content.Intent;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


       Intent intent = getIntent();


        String winAmount = intent.getExtras().getString("win");
        TextView winTextView = findViewById(R.id.wins);
        winTextView.setText("You have wone "+ winAmount +" number of games.");

        String lossAmount = intent.getExtras().getString("loss");
        TextView lossTextView =findViewById(R.id.losses);
        lossTextView.setText("You have lost "+ lossAmount+ " number of games.");

        String drawAmount = intent.getExtras().getString("draw");
        TextView drawTextView = findViewById(R.id.draws);
        drawTextView.setText("You have drawn " + drawAmount + " number of games.");
    }


}
