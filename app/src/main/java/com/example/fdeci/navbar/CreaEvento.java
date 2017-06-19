package com.example.fdeci.navbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by fdeci on 09/06/2017.
 */

public class CreaEvento extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crea_evento1);

    }

    public void conferma(View v) {
        Toast.makeText(this, "Registrazione avvenuta con successo!", Toast.LENGTH_SHORT).show();
        Intent openPage1 = new Intent(CreaEvento.this, Home.class);
        startActivity(openPage1);
    }

    public void avantiUno(View v) {
        setContentView(R.layout.activity_crea_evento2);
    }

    public void indietroDue(View v) {
        setContentView(R.layout.activity_crea_evento1);
    }


    public void annullaUno(View v) {
        Intent openPage1 = new Intent(CreaEvento.this, Home.class);
        startActivity(openPage1);
    }
}