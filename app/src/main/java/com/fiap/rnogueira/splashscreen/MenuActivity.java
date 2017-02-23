package com.fiap.rnogueira.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void play(View v){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    public void sair(View v){
        finish();
    }
}
