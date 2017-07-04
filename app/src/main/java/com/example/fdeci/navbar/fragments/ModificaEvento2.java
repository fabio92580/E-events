package com.example.fdeci.navbar.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.fdeci.navbar.AreaRiservataGestore;
import com.example.fdeci.navbar.R;

/**
 * Created by Martina on 19/06/2017.
 */

public class ModificaEvento2 extends AppCompatActivity{
 private Toolbar toolbar;
    Button immagine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificaevento2);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        immagine=(Button) findViewById(R.id.carica);
        immagine.setOnClickListener(new View.OnClickListener(){
                                        @Override
                                        public void onClick(View arg0) {
                                            //caricare immagine
                                        }

        });

    }
    //id button: button8
    public void indietro(View view)
    {
        Intent intent = new Intent(ModificaEvento2.this, ModificaEvento1.class);
        startActivity(intent);
    }

    //id button: button9
    public void confermaModifiche(View view){
        /*Intent ritorno= new Intent(ModificaLocali.this, ScrollingActivity.class);
        startActivity(ritorno);
        finish();*/
        startActivity(new Intent(getApplicationContext(),AreaRiservataGestore.class));
        String mess="Modifiche apportate con successo";
        Toast toast= Toast.makeText(this, mess.toString(), Toast.LENGTH_LONG);
        toast.show();
        //toast.setGravity(Gravity.TOP|Gravity.LEFT,40,40);
    }

}


