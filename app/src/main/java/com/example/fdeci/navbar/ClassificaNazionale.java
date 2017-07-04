package com.example.fdeci.navbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



/**
 * Created by Martina on 21/06/2017.
 */

public class ClassificaNazionale extends AppCompatActivity {

    private Toolbar toolbar;
    private Button btnindietro, btnstatistica;
    private ImageView infolatini, infohouse, infojazz, inforock;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nazionale);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnstatistica = (Button) findViewById(R.id.statistica);
        btnstatistica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent paginaweb = new Intent("android.intent.action.VIEW", Uri.parse("http://eevents.altervista.org/ProgettoUniversitaPHP/Statistiche/apps/Statistiche/index.html"));
                startActivity(paginaweb);


            }
        });
        btnindietro = (Button) findViewById(R.id.indietro);
        btnindietro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent redirect = new Intent(ClassificaNazionale.this, VisualizzaTendenze.class);
                startActivity(redirect);
            }
        });


        infolatini =(ImageView) findViewById(R.id.infolatini);
        infolatini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent paginaweb = new Intent(ClassificaNazionale.this, InfoLatini.class);
                startActivity(paginaweb);
            }
        });

        infojazz =(ImageView) findViewById(R.id.infojazz);
        infojazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent paginaweb = new Intent(ClassificaNazionale.this, InfoJazz.class);
                startActivity(paginaweb);
            }
        });
        inforock =(ImageView) findViewById(R.id.inforock);
        inforock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent paginaweb = new Intent(ClassificaNazionale.this, InfoRock.class);
                startActivity(paginaweb);
            }
        });
        infohouse =(ImageView) findViewById(R.id.infohouse);
        infohouse.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {

                Intent redirect=new Intent(ClassificaNazionale.this,InfoHouse.class);
                startActivity(redirect);

            }
        });


    }




    }

