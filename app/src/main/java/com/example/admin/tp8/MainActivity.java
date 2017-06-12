package com.example.admin.tp8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private VraiFaux[] question = new VraiFaux[]{
            new VraiFaux("Qui a fait a pole position au grandprix de F1 du Cananda?", "Lewis Hamilton","Sebastian Vettel", true),
            new VraiFaux("Qui a gagné le grandprix de F1 du Cananda?", "Lewis Hamilton","Daniel Ricciardo", true),
            new VraiFaux("Qui a fait a pole position au grandprix de F1 du Cananda?", "Lewis Hamilton","Sebastian Vettel", true),
            new VraiFaux("Qui a gagné le grandprix de F1 du Cananda?", "Lewis Hamilton","Daniel Ricciardo", true),
            new VraiFaux("Qui a fait a pole position au grandprix de F1 du Cananda?", "Lewis Hamilton","Sebastian Vettel", true),
            new VraiFaux("Qui a gagné le grandprix de F1 du Cananda?", "Lewis Hamilton","Daniel Ricciardo", true),
            new VraiFaux("Qui a fait a pole position au grandprix de F1 du Cananda?", "Lewis Hamilton","Sebastian Vettel", true),
            new VraiFaux("Qui a gagné le grandprix de F1 du Cananda?", "Lewis Hamilton","Daniel Ricciardo", true),
    };
    private int index = 0;
private int resultat=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView questionText = (TextView) findViewById(R.id.textView2);


        final Button button1 = (Button) findViewById(R.id.button1);
      final Button button2 = (Button) findViewById(R.id.button2);

        questionText.setText(question[index].getQuestion()+resultat);
        button1.setText(question[index].getQuestion1());
        button2.setText(question[index].getQuestion2());

        button1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Log.d("Bouton", "Bouton 1");
                if(index<question.length-1) {
                    questionText.setText(question[index].getQuestion()+resultat);
                    if(question[index].isResponse()){
                        resultat++;
                    }
                    button1.setText(question[index].getQuestion1());
                    button2.setText(question[index].getQuestion2());

                    index++;

                }
                else {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    final int score = resultat;
                    intent.putExtra("param",score);
                    startActivity(intent);
                }
                }
        });

        button2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Log.d("Bouton", "Bouton 2");

                if(index<question.length-1) {
                    questionText.setText(question[index].getQuestion());
                    if(!question[index].isResponse()){
                        resultat++;
                    }
                    button1.setText(question[index].getQuestion1());
                    button2.setText(question[index].getQuestion2());

                    index++;
                }
                else {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    final int score = resultat;
                    intent.putExtra("param",score);
                    startActivity(intent);
                }
            }
        });
    }
}
