package br.com.douglassilverio.duckclicker.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.douglassilverio.duckclicker.R;

public class DifficultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dificuldade);
    }

    public void facil(View view){
        Intent myIntent = new Intent(this, GameActivity.class);
        myIntent.putExtra("DIFFICULTY", "EASY");
        startActivity(myIntent);
    }

    public void dificil(View view){
        Intent myIntent = new Intent(this, GameActivity.class);
        myIntent.putExtra("DIFFICULTY", "HARD");
        startActivity(myIntent);
    }
}