package br.com.douglassilverio.duckclicker.jogar.jogo;

import androidx.appcompat.app.AppCompatActivity;

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
    TextView placar;
    View iniciar;
    TextView cronometro;
    View a1;
    View a2;
    View a3;
    View b1;
    View b2;
    View b3;
    View c1;
    View c2;
    View c3;
    View d1;
    View d2;
    View d3;
    View e1;
    View e2;
    View e3;

    final Handler handler = new Handler(Looper.getMainLooper());
    Random random = new Random();
    Timer timer = new Timer();

    int numeroAleatorio;
    int tempo = 30;
    public static String dificuldade;
    int pontuacaoCliques = 0;
    int loopDificuldade = 0;

    String[] armazenaViews = new String[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);
        iniciar = findViewById(R.id.button4); //atribuição de variáveis
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
        setaTodosBotoesInvisiveis();
        placar = findViewById(R.id.textView7);
        cronometro = findViewById(R.id.textView8);
    }

    public void setaTodosBotoesInvisiveis() {
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

    public void iniciar(View view) {
        iniciar.setVisibility(View.INVISIBLE);
        setaTodosBotoesInvisiveis();
        randomizaPosicoes();
        cronometro();
    }

    public void cronometro() {
        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                tempo = tempo - 1;
                cronometro.setText(String.valueOf(tempo));
            }
        };
        timer.scheduleAtFixedRate(t, 1000, 1000);
    }

    public void delayBotaoFicarInvisivelVisivelDificil(View x, int y, int z, int w) {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                x.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                x.setVisibility(View.INVISIBLE);
            }
        }, z);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                x.setVisibility(View.VISIBLE);
            }
        }, w);

    }


    public void filtroDificuldade() {
        if (dificuldade.equals("dificil")) {
            loopDificuldade = 1;
            randomizaPosicoes();
        }
    }

    public void instrucoesRandomizaPosicoes(View x, int delay1, int delay2, int delay3, int delay4, int delay5, int delay6) {
            delayBotaoFicarInvisivelVisivelDificil(x, delay1, delay2, delay3);
            delayBotaoFicarInvisivelVisivelDificil(x, delay4, delay5, delay6);
            filtroDificuldade();
    }

    public void randomizaPosicoes() {
        numeroAleatorio = random.nextInt(14);
        if (loopDificuldade == 0) {
            switch (numeroAleatorio) {
                case 0:
                    instrucoesRandomizaPosicoes(a1, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 1:
                    instrucoesRandomizaPosicoes(a2, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 2:
                    instrucoesRandomizaPosicoes(a3, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 3:
                    instrucoesRandomizaPosicoes(b1, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 4:
                    instrucoesRandomizaPosicoes(b2, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 5:
                    instrucoesRandomizaPosicoes(b3, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 6:
                    instrucoesRandomizaPosicoes(c1, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 7:
                    instrucoesRandomizaPosicoes(c2, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 8:
                    instrucoesRandomizaPosicoes(c3, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 9:
                    instrucoesRandomizaPosicoes(d1, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 10:
                    instrucoesRandomizaPosicoes(d2, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 11:
                    instrucoesRandomizaPosicoes(d3, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 12:
                    instrucoesRandomizaPosicoes(e1, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 13:
                    instrucoesRandomizaPosicoes(e2, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
                case 14:
                    instrucoesRandomizaPosicoes(e3, 750, 1400, 2100, 2850, 3600, 4300);
                    break;
            }
        }
    }

    public void instrucoesBotoes(View x) {
        x.setVisibility(View.INVISIBLE);
        pontuacaoCliques++;
        placar.setText(String.valueOf(pontuacaoCliques));
        if (dificuldade.equals("dificil")) {
            loopDificuldade = 0;
            randomizaPosicoes();
        } else {
            randomizaPosicoes();
        }
    }

    public void a1(View view) {
        instrucoesBotoes(a1);
    }

    public void a2(View view) {
        instrucoesBotoes(a2);
    }

    public void a3(View view) {
        instrucoesBotoes(a3);
    }

    public void b1(View view) {
        instrucoesBotoes(b1);
    }

    public void b2(View view) {
        instrucoesBotoes(b2);
    }

    public void b3(View view) {
        instrucoesBotoes(b3);
    }
    public void c1(View view) {
        instrucoesBotoes(c1);
    }
    public void c2(View view) {
        instrucoesBotoes(c2);
    }
    public void c3(View view) {
        instrucoesBotoes(c3);
    }
    public void d1(View view) {
        instrucoesBotoes(d1);
    }
    public void d2(View view) {
        instrucoesBotoes(d2);
    }
    public void d3(View view) {
        instrucoesBotoes(d3);
    }
    public void e1(View view) {
        instrucoesBotoes(e1);
    }
    public void e2(View view) {
        instrucoesBotoes(e2);
    }
    public void e3(View view) {
        instrucoesBotoes(e3);
    }

}