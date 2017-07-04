package com.example.fdeci.navbar.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.example.fdeci.navbar.AreaRiservataGestore;
import com.example.fdeci.navbar.R;
/**
 * Created by Martina on 19/06/2017.
 */
public class ModificaLocale3 extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificalocale3);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
    //id button: button8
    public void indietro(View view)
    {
        Intent intent = new Intent(ModificaLocale3.this, ModificaLocale2.class);
        startActivity(intent);
    }

    //id button: button3
   public void confermaModifiche(View view){
        startActivity(new Intent(getApplicationContext(),AreaRiservataGestore.class));
        String mess="Modifiche apportate con successo";
        Toast toast= Toast.makeText(this, mess.toString(), Toast.LENGTH_LONG);
        toast.show();
        //toast.setGravity(Gravity.TOP|Gravity.LEFT,40,40);
    }

}


