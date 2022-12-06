package br.com.douglassilverio.duckclicker.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.douglassilverio.duckclicker.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view){
        Intent myIntent = new Intent(this, Dificuldade.class);
        startActivity(myIntent);
    }
}