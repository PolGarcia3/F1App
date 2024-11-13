package com.example.app1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SumaResultatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        TextView resultat = new TextView(this);
        resultat.setTextSize(24);
        resultat.setText("la suma és "
                + sumar(intent.getIntExtra("n1",0),
                intent.getIntExtra("n2",0)));
        setContentView(resultat);
    }

    private int sumar(int x, int y){
        return x+y;
    }
}
