package com.example.fdeci.navbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.fdeci.navbar.R;

/**
 * Created by Martina on 21/06/2017.
 */

public class InfoRock extends AppCompatActivity {
    private Toolbar toolbar;
    private Button indietro;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_rock);
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
                Intent redirect=new Intent(InfoRock.this,ClassificaNazionale.class);
                startActivity(redirect);

            }
        });

    }
}
