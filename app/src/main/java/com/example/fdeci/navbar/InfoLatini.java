package com.example.fdeci.navbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.fdeci.navbar.R;

/**
 * Created by Martina on 21/06/2017.
 */

public class InfoLatini extends AppCompatActivity{

   private Toolbar toolbar;
    private Button indietro;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serata_latina);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        indietro = (Button) findViewById(R.id.indietro);
        indietro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent redirect = new Intent(InfoLatini.this, ClassificaNazionale.class);
                startActivity(redirect);
            }
        });
    }
}
