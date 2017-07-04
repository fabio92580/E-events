package com.example.fdeci.navbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



/**
 * Created by Martina on 21/06/2017.
 */

public class ClassificaLocale extends AppCompatActivity {
    private Toolbar toolbar;
    private Button btngrafici, btnindietro, btnzona;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locale);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btngrafici = (Button) findViewById(R.id.statistiche);
        btngrafici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent paginaweb = new Intent("android.intent.action.VIEW", Uri.parse("http://eevents.altervista.org/ProgettoUniversitaPHP/Statistiche/apps/Statistiche/index.html"));
                startActivity(paginaweb);

            }
        });
        btnindietro =(Button) findViewById(R.id.indietro);
        btnindietro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent redirect = new Intent(ClassificaLocale.this, VisualizzaTendenze.class);
                startActivity(redirect);

            }
        });
        btnzona =(Button) findViewById(R.id.zona);
        btnzona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent zona = new Intent(ClassificaLocale.this, ZonaTendenze.class);
                startActivity(zona);


            }
        });
    }
 /*   public void scegliZona(View view)
    {
        Intent intent = new Intent(this, ZonaTendenze.class);
        startActivity(intent);
        finish();
    }*/
}
