package com.example.fdeci.navbar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.fdeci.navbar.R;

/**
 * Created by Martina on 21/06/2017.
 */

public class ZonaTendenze extends AppCompatActivity {
    private Toolbar toolbar;
    private Button btnindietro, btnclassifica;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnindietro = (Button) findViewById(R.id.button10);
        btnindietro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent redirect = new Intent(ZonaTendenze.this, ClassificaLocale.class);
                startActivity(redirect);

            }
        });
        btnclassifica = (Button) findViewById(R.id.button11);
        btnclassifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // effettuare l'ordinamento di classifica
                Intent ordinata = new Intent(ZonaTendenze.this, ClassificaLocale.class);
                startActivity(ordinata);

            }
        });
    }
}