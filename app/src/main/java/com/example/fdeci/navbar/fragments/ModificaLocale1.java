package com.example.fdeci.navbar.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import com.example.fdeci.navbar.R;

/**
 * Created by Martina on 19/06/2017.
 */

public class ModificaLocale1 extends AppCompatActivity {
    private Toolbar toolbar;
    Button btnavanti;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificalocale1);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnavanti=(Button)findViewById(R.id.button8);
        btnavanti.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {

                // TODO Auto-generated method stub
                Intent redirect=new Intent(ModificaLocale1.this,ModificaLocale2.class);
                startActivity(redirect);

            }
        });
    }
}
