package com.example.admin.tp8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //on récupère l'intent qui a lancé votre activité
        Intent intent = getIntent();
       int texte = intent.getIntExtra("param",0);
        int total = intent.getIntExtra("total",0);

        TextView editText = (TextView) findViewById(R.id.response);
        editText.setText(texte +"/"+total);

    }
}
