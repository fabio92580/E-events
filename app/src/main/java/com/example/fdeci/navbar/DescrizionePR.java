package com.example.fdeci.navbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by fdeci on 17/06/2017.
 */

public class DescrizionePR extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descrizione_pr);

    }

    public void vediEventi(View v){
        Intent openPage1= new Intent(DescrizionePR.this, ListaEventi.class);
        startActivity(openPage1);
    }

    public void segui(View v){
        // Show Toast
        Toast.makeText(getApplicationContext(),
                "Hai iniziato a seguirlo", Toast.LENGTH_LONG).show();
    }
}