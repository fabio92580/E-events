package com.example.fdeci.navbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by fdeci on 31/05/2017.
 */

public class RegistraCatering extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registra_catering1);

    }

    public void conferma(View v) {
        Toast.makeText(this, "Registrazione avvenuta con successo!", Toast.LENGTH_SHORT).show();
        Intent openPage1 = new Intent(RegistraCatering.this, HomeServizioCatering.class);
        startActivity(openPage1);
    }

    public void avantiUno(View v) {
        setContentView(R.layout.activity_registra_catering2);
    }

    public void indietroDue(View v) {
        setContentView(R.layout.activity_registra_catering1);
    }


    public void annullaUno(View v) {
        Intent openPage1 = new Intent(RegistraCatering.this, Accedi.class);
        startActivity(openPage1);
    }
}