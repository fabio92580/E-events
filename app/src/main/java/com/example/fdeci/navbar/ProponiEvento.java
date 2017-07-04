package com.example.fdeci.navbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by fdeci on 09/06/2017.
 */

public class ProponiEvento extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proponi_evento);

    }

    public void annulla(View v) {
        Intent openPage1 = new Intent(ProponiEvento.this, HomeUtenteRegistrato.class);
        startActivity(openPage1);
    }
    public void conferma(View v) {
        Toast.makeText(this, "Proposta di evento inviata con successo!", Toast.LENGTH_SHORT).show();
        Intent openPage1 = new Intent(ProponiEvento.this, HomeUtenteRegistrato.class);
        startActivity(openPage1);
    }


}