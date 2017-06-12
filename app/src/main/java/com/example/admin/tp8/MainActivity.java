package com.example.admin.tp8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("Bouton", "Bouton 1");
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("param", "Vrai ,  et il a réalisé le record de la piste!");
                startActivity(intent);
            }
        });
    }
    public void bouton2(View view){
        Log.d("Bouton", "Button 2");
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        intent.putExtra("param","Faux, il a fait le second chrono");
        startActivity(intent);
    }
}
