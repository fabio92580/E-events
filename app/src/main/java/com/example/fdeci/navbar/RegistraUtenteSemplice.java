package com.example.fdeci.navbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by fdeci on 30/05/2017.
 */

public class RegistraUtenteSemplice extends Activity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registra_utente_semplice);

    }

    public void conferma(View v){
        Toast.makeText(this, "Registrazione avvenuta con successo!", Toast.LENGTH_SHORT).show();
        Intent openPage1= new Intent(RegistraUtenteSemplice.this, Accedi.class);
        startActivity(openPage1);
    }

    public void annulla(View v){
        Intent openPage1= new Intent(RegistraUtenteSemplice.this, Accedi.class);
        startActivity(openPage1);
    }
}
