package com.fiap.rnogueira.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnConfirmar = (Button)findViewById(R.id.btnConfirmPlayers);
        btnConfirmar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ConfirmPlayersNumber();
            }
        });
    }

    private void ConfirmPlayersNumber(){
        int players = Integer.parseInt(((EditText)findViewById(R.id.etPlayers))
                .getText()
                .toString());

        Intent intent = new Intent(MenuActivity.this, DiceActivity.class);
        intent.putExtra("players", players);

        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
        MenuActivity.this.finish();
    }
}
