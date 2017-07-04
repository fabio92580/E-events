package com.example.fdeci.navbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Martina on 23/06/2017.
 */

public class CercaEvento extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    private Toolbar toolbar;
    private TableLayout tavola1, tavola2, tavola0;
    private Button canc, cerca1, cerca2, cerca3;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cerca_evento);//main
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner6);

        tavola1 = (TableLayout) findViewById(R.id.tavola1);
        tavola0 = (TableLayout) findViewById(R.id.tavola0);
        tavola2 = (TableLayout) findViewById(R.id.tavola2);
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        canc = (Button) findViewById(R.id.canc);
        cerca1 = (Button) findViewById(R.id.cercaNome);
        cerca2 = (Button) findViewById(R.id.cercaGeografia);
        cerca3 = (Button) findViewById(R.id.cercaCategoria);
        canc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent redirect = new Intent(CercaEvento.this, MainActivity.class);
                startActivity(redirect);
            }
        });


        cerca1.setOnClickListener(this);


        //cerca1.setOnClickListener(this);
        cerca2.setOnClickListener(this);
        cerca3.setOnClickListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Per nome");
        categories.add("Per area geografica");
        categories.add("Per tipologia");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
        //per area geografica
        if (position == 1) {
            tavola0.setVisibility(View.INVISIBLE);
            tavola2.setVisibility(View.INVISIBLE);
            tavola1.setVisibility(View.VISIBLE);
            cerca2.setVisibility(View.VISIBLE);
            cerca1.setVisibility(View.INVISIBLE);
            cerca3.setVisibility(View.INVISIBLE);
        } else if (position == 2) {
            tavola0.setVisibility(View.INVISIBLE);
            tavola1.setVisibility(View.INVISIBLE);
            tavola2.setVisibility(View.VISIBLE);
            cerca2.setVisibility(View.INVISIBLE);
            cerca1.setVisibility(View.INVISIBLE);
            cerca3.setVisibility(View.VISIBLE);
        } else if (position == 0) {
            tavola0.setVisibility(View.VISIBLE);
            tavola1.setVisibility(View.INVISIBLE);
            tavola2.setVisibility(View.INVISIBLE);
            cerca2.setVisibility(View.INVISIBLE);
            cerca1.setVisibility(View.VISIBLE);
            cerca3.setVisibility(View.INVISIBLE);
            //cercanome();
        }
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cercaNome:
                startActivity(new Intent(CercaEvento.this, RicercaNome.class));
                break;
            case R.id.cercaGeografia:
                startActivity(new Intent(CercaEvento.this, RicercaGeograficamente.class));
                break;
            case R.id.cercaCategoria:
                startActivity(new Intent(CercaEvento.this, RicercaCategoria.class));
                break;
        }
    }


}
