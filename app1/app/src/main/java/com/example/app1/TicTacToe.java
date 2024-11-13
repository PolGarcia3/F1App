package com.example.app1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Classe que hereta de la classe Activity i implementa listeners per als
 * botons de imatge per jugar al tres en ratlla.
 * Utilitza un layout XML per a definir la interfície i mostra diversos
 * botons d'imatge.
 * @author sergi.grau
 * @version 1.0, 06/11/2012
 * @version 2.0, 1/10/2020, actualització a API.30
 * @version 3.0, 07/10/2024, canvi a ImageButton i optimització
 */
public class TicTacToe extends AppCompatActivity implements View.OnClickListener {

    private ImageButton[] imageButtons = new ImageButton[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tictactoe);

        // Array que conté els IDs dels botons d'imatge
        int[] buttonIds = {
                R.id.imageButton1, R.id.imageButton2, R.id.imageButton3,
                R.id.imageButton4, R.id.imageButton5, R.id.imageButton6,
                R.id.imageButton7, R.id.imageButton8, R.id.imageButton9
        };

        // Inicialització dels botons i assignació del listener
        for (int i = 0; i < buttonIds.length; i++) {
            imageButtons[i] = findViewById(buttonIds[i]);
            imageButtons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        // Registre de quin botó ha estat clicat
        Log.v("TicTacToe", "Botó seleccionat: " + view.getId());
    }
}
