package com.example.app1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SumaActivity extends AppCompatActivity {

    private static final int TEMPS = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        Button boto = findViewById(R.id.botoSuma);
        EditText n1 = findViewById(R.id.num1);
        EditText n2 = findViewById(R.id.num2);

        boto.setOnClickListener(vista -> {
            Intent intent = new Intent(this, SumaResultatActivity.class);
            intent.putExtra("n1",Integer.parseInt(n1.getText().toString()));
            intent.putExtra("n2", Integer.parseInt(n2.getText().toString()));
            startActivity(intent);
        });

        Handler handler = new Handler();
        Runnable FilOcultacio = () -> boto.setVisibility(Button.GONE);
        handler.postDelayed(FilOcultacio, TEMPS);
    }
}
