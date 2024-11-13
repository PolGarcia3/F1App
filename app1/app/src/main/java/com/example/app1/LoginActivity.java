package com.example.app1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    public static final String NOM = "nom";
    public static final String EMAIL = "email";
    public static final String PASSWORD = "password";

    private Button botoLogin;
    private EditText nom, email, password;

    @Override
    protected void onPause(){
        super.onPause();
        Log.v("DAM2", "Pausa");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        botoLogin=  findViewById(R.id.login);
        nom = findViewById(R.id.nom);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        botoLogin.setOnClickListener(view -> {
            Intent intent = new Intent(this, LoginResultatActivity.class);
            intent.putExtra(NOM, nom.getText().toString());
            intent.putExtra(EMAIL, email.getText().toString());
            intent.putExtra(PASSWORD, password.getText().toString());
            startActivity(intent);
        });
    }
}