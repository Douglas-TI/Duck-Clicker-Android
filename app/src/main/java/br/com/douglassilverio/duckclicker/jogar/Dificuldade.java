package br.com.douglassilverio.duckclicker.jogar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.douglassilverio.duckclicker.R;
import br.com.douglassilverio.duckclicker.jogar.jogo.Jogo;

public class Dificuldade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dificuldade);

    }

    public void facil(View view){
        Jogo.dificuldade = "facil";
        Intent myIntent = new Intent(this, Jogo.class);
        startActivity(myIntent);

    }

    public void dificil(View view){
        Jogo.dificuldade = "dificil";
        Intent myIntent = new Intent(this, Jogo.class);
        startActivity(myIntent);
    }
}