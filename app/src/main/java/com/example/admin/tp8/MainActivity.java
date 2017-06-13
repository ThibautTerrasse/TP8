package com.example.admin.tp8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //tableau de questions et réponses
    private VraiFaux[] question = new VraiFaux[]{
            new VraiFaux("Qui a fait a pole position au grandprix de F1 du Cananda?", "Lewis Hamilton","Sebastian Vettel", true),
            new VraiFaux("Qui a gagné le grandprix de F1 du Cananda?", "Lewis Hamilton","Daniel Ricciardo", true),
            new VraiFaux("A quel place a fini Esteban Ocon sur le GrandPrix du Canada?", "6","3", true),
            new VraiFaux("Qui a eu un accident au début du GradPrix du Canada?", "Kimi Raikonnen","Carlos Sainz", false),
            new VraiFaux("Qui est en tête du Championnat pilote de F1 2017?", "Sebastian Vettel","Lewis Hamilton", true),
            new VraiFaux("Quelle est le nombre total de victoire de Lewis Hamilton?", "53","56", false),
            new VraiFaux("Quel est le prochain GrandPrix de F1?", "Baku","Spa Francorchamps", true),
            new VraiFaux("Quelle est la place de Max Verstappen aux Championnat?", "6","4", true),
    };

    //Compteur pour l'index et le score
    private int index = 0;
    private int resultat = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Affichage des données du tableau VraiFauxs sur les éléments de l'activity
        final TextView questionText = (TextView) findViewById(R.id.textView2);
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);

        questionText.setText(question[index].getQuestion());
        button1.setText(question[index].getQuestion1());
        button2.setText(question[index].getQuestion2());

        button1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Log.d("Bouton", "Bouton 1");
                if(question[index].isResponse()){
                    resultat++;

                }

                index++; //on incrémente l'index pour changer de question

                if(index<question.length) { // on vérifie que l'on est encore dans le tableau

                    //Modification des éléments de l'activity avec le bon index
                    questionText.setText(question[index].getQuestion());
                    button1.setText(question[index].getQuestion1());
                    button2.setText(question[index].getQuestion2());
                }

                else {

                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    final int score = resultat;

                    //envoie du score sur la deuxième activity
                    intent.putExtra("scoreCandidat",score);
                    intent.putExtra("totalMax",index);
                    startActivity(intent);
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Log.d("Bouton", "Bouton 2");

                if(!question[index].isResponse()){
                    resultat++;

                }
                index++; // on incrémente pour changer de question

                if(index<question.length){ // Vérification que l'on est encore dans le tableau

                    //modication des éléments de l'activity
                    questionText.setText(question[index].getQuestion());
                    button1.setText(question[index].getQuestion1());
                    button2.setText(question[index].getQuestion2());
                }

                else {

                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    final int score = resultat;

                    //envoie du score sur la deuxième activity
                    intent.putExtra("param",score);
                    intent.putExtra("total",index);

                    startActivity(intent);
                }

            }
        });
    }
}
