package com.example.fdeci.navbar;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/**
 * Created by fdeci on 05/06/2017.
 */

public class CercaEventi extends Activity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerca_eventi);

        spinner= (Spinner) findViewById(R.id.spinner);
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"Per nome", "Per area geografica", "Per tipologia"});
        spinner.setAdapter((SpinnerAdapter) adapter);
    }

    public void indietro(View v){
        Intent openPage1= new Intent(CercaEventi.this, Home.class);
        startActivity(openPage1);
    }

    public void cercaEventi(View v){
        int item=spinner.getSelectedItemPosition();
        if(item==0) {
            Intent openPage1 = new Intent(CercaEventi.this, Home.class);
            startActivity(openPage1);
        }
        else if(item==1){
            Intent openPage1 = new Intent(CercaEventi.this, Home.class);
            startActivity(openPage1);
        }
        else if(item==2){
            Intent openPage1 = new Intent(CercaEventi.this, Home.class);
            startActivity(openPage1);
        }
    }
}
