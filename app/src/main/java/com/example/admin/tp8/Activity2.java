package com.example.admin.tp8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private VraiFaux[] question = new VraiFaux[]{
            new VraiFaux("Qui a fait a pole position au grandprix de F1 du Cananda?", " Vrai, et il a réalisé le record de la piste!","Faux, il a fait le second chrono", true),
            new VraiFaux("Qui a gagné le grandprix de F1 du Cananda?", " Vrai et c'est sa 56ème victoire en carriere!","Faux, il a fini troisième", true),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //on récupère l'intent qui a lancé votre activité
        Intent intent = getIntent();
        String texte = intent.getStringExtra("param");

        TextView editText = (TextView) findViewById(R.id.response);
        editText.setText(texte);

    }
}
