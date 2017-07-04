package com.example.fdeci.navbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.fdeci.navbar.R;

/**
 * Created by Martina on 20/06/2017.
 */

public class ServizioTrasportoRiservato2  extends AppCompatActivity {

    private Toolbar toolbar;
    private Button btnconferma, btnindietro;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilotrasporto2);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnconferma = (Button) findViewById(R.id.conferma);
        btnconferma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent redirect = new Intent(ServizioTrasportoRiservato2.this, MainActivity.class);
                startActivity(redirect);
                String mess = "Modifica al profilo avvenuta con successo";
                Toast toast = Toast.makeText(ServizioTrasportoRiservato2.this, mess.toString(), Toast.LENGTH_LONG);
                toast.show();

            }
        });
        btnindietro =(Button) findViewById(R.id.indietro);
        btnindietro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent redirect = new Intent(ServizioTrasportoRiservato2.this, ServizioTrasportoRiservato.class);
                startActivity(redirect);
            }
        });
    }
}