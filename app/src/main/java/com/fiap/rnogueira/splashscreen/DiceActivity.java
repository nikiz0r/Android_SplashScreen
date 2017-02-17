package com.fiap.rnogueira.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        int players = getIntent().getIntExtra("players", 1);

        TextView tvPlayers = (TextView)findViewById(R.id.tvPlayers);
        tvPlayers.setText(Integer.toString(players));
    }
}
