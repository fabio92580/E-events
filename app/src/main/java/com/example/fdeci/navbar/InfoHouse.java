package com.example.fdeci.navbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.fdeci.navbar.R;
import com.example.fdeci.navbar.fragments.ModificaLocale1;

/**
 * Created by Martina on 21/06/2017.
 */

public class InfoHouse  extends AppCompatActivity {
    private Toolbar toolbar;
    private Button indietro;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_house);
        //toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        indietro= (Button) findViewById(R.id.indietro);
        indietro.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {

                // TODO Auto-generated method stub
                Intent redirect=new Intent(InfoHouse.this,ClassificaNazionale.class);
                startActivity(redirect);

            }
        });

    }
}
