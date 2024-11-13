package com.example.app1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginResultatActivity extends AppCompatActivity {
    TextView resultat;
    ImageView imatge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_resultat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        resultat = findViewById(R.id.resultat);
        imatge = findViewById(R.id.imatge);
        Intent intent = getIntent();
        if(verificarNom(intent.getStringExtra(LoginActivity.NOM))
            && verificarEmail(intent.getStringExtra(LoginActivity.EMAIL))
            && verificarPassword(intent.getStringExtra(LoginActivity.PASSWORD))
        ){
            resultat.setText("OK");
            imatge.setImageResource(R.drawable.ok);
            Log.v("DAM2", "OK");
        }
    }

    private boolean verificarNom(String nom){
        return nom.length()>0;
    }
    private boolean verificarEmail(String email){
        return email.endsWith(".edu");
    }
    private boolean verificarPassword(String password){
        return password.length()>=8 && password.length()<=12;
    }
}