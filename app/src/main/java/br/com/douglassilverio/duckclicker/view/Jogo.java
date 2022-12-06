package br.com.douglassilverio.duckclicker.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import br.com.douglassilverio.duckclicker.R;

public class Jogo extends AppCompatActivity {

    private TextView placar;
    private View iniciar;
    private TextView cronometro;
    private View a1;
    private View a2;
    private View a3;
    private View b1;
    private View b2;
    private View b3;
    private View c1;
    private View c2;
    private View c3;
    private View d1;
    private View d2;
    private View d3;
    private View e1;
    private View e2;
    private View e3;

    private int tempo = 30;
    private int pontuacaoCliques = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        loadView();
    }

    private void loadView() {
        iniciar = findViewById(R.id.button4);
        placar = findViewById(R.id.textView7);
        cronometro = findViewById(R.id.textView8);

        a1 = findViewById(R.id.A1);
        a2 = findViewById(R.id.A2);
        a3 = findViewById(R.id.A3);

        b1 = findViewById(R.id.B1);
        b2 = findViewById(R.id.B2);
        b3 = findViewById(R.id.B3);

        c1 = findViewById(R.id.C1);
        c2 = findViewById(R.id.C2);
        c3 = findViewById(R.id.C3);

        d1 = findViewById(R.id.D1);
        d2 = findViewById(R.id.D2);
        d3 = findViewById(R.id.D3);

        e1 = findViewById(R.id.E1);
        e2 = findViewById(R.id.E2);
        e3 = findViewById(R.id.E3);

        setDifficulty();
    }

    private void setDifficulty() {
        Intent i = getIntent();
        Bundle params = i.getExtras();
        if(params == null)
            return;

        String dificuldade = i.getStringExtra("DIFFICULTY");
    }

    public void start(View view) {
        iniciar.setVisibility(View.INVISIBLE);

        setAllButtonsInvisible();
        randomPositionToFade();
        cronometer();
    }

    public void setAllButtonsInvisible() {
        a1.setVisibility(View.INVISIBLE);
        a2.setVisibility(View.INVISIBLE);
        a3.setVisibility(View.INVISIBLE);

        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);

        c1.setVisibility(View.INVISIBLE);
        c2.setVisibility(View.INVISIBLE);
        c3.setVisibility(View.INVISIBLE);

        d1.setVisibility(View.INVISIBLE);
        d2.setVisibility(View.INVISIBLE);
        d3.setVisibility(View.INVISIBLE);

        e1.setVisibility(View.INVISIBLE);
        e2.setVisibility(View.INVISIBLE);
        e3.setVisibility(View.INVISIBLE);
    }

    public void cronometer() {
        Timer timer = new Timer();

        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                tempo = tempo - 1;
                cronometro.setText(String.valueOf(tempo));
            }
        };
        timer.scheduleAtFixedRate(t, 1000, 1000);
    }

    public void randomPositionToFade() {
        int numeroAleatorio = new Random().nextInt(14);

        switch (numeroAleatorio) {
            case 0:
                delayBtVibility(a1, 750, 1400, 2100);
                break;
            case 1:
                delayBtVibility(a2, 750, 1400, 2100);
                break;
            case 2:
                delayBtVibility(a3, 750, 1400, 2100);
                break;
            case 3:
                delayBtVibility(b1, 750, 1400, 2100);
                break;
            case 4:
                delayBtVibility(b2, 750, 1400, 2100);
                break;
            case 5:
                delayBtVibility(b3, 750, 1400, 2100);
                break;
            case 6:
                delayBtVibility(c1, 750, 1400, 2100);
                break;
            case 7:
                delayBtVibility(c2, 750, 1400, 2100);
                break;
            case 8:
                delayBtVibility(c3, 750, 1400, 2100);
                break;
            case 9:
                delayBtVibility(d1, 750, 1400, 2100);
                break;
            case 10:
                delayBtVibility(d2, 750, 1400, 2100);
                break;
            case 11:
                delayBtVibility(d3, 750, 1400, 2100);
                break;
            case 12:
                delayBtVibility(e1, 750, 1400, 2100);
                break;
            case 13:
                delayBtVibility(e2, 750, 1400, 2100);
                break;
            case 14:
                delayBtVibility(e3, 750, 1400, 2100);
                break;
        }
    }

    public void delayBtVibility(View x, int delay1, int delay2, int delay3) {
        Handler handler = new Handler(Looper.getMainLooper());

        handler.postDelayed(() -> x.setVisibility(View.VISIBLE), delay1);
        handler.postDelayed(() -> x.setVisibility(View.INVISIBLE), delay2);
        handler.postDelayed(() -> x.setVisibility(View.VISIBLE), delay3);
    }

    public void btClick(View x) {
        x.setVisibility(View.INVISIBLE);
        pontuacaoCliques++;
        placar.setText(String.valueOf(pontuacaoCliques));

        randomPositionToFade();
    }

    public void a1(View view) {
        btClick(a1);
    }
    public void a2(View view) {
        btClick(a2);
    }
    public void a3(View view) {
        btClick(a3);
    }
    public void b1(View view) {
        btClick(b1);
    }
    public void b2(View view) {
        btClick(b2);
    }
    public void b3(View view) {
        btClick(b3);
    }
    public void c1(View view) {
        btClick(c1);
    }
    public void c2(View view) {
        btClick(c2);
    }
    public void c3(View view) {
        btClick(c3);
    }
    public void d1(View view) {
        btClick(d1);
    }
    public void d2(View view) {
        btClick(d2);
    }
    public void d3(View view) {
        btClick(d3);
    }
    public void e1(View view) {
        btClick(e1);
    }
    public void e2(View view) {
        btClick(e2);
    }
    public void e3(View view) {
        btClick(e3);
    }
}