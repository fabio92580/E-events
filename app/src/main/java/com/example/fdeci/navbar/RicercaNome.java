package com.example.fdeci.navbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;



/**
 * Created by Martina on 23/06/2017.
 */

public class RicercaNome extends AppCompatActivity {

    private Toolbar toolbar;
    public ListView listView;
    CustomAdapterEvento customAdapter;
    private int[] tabIcons = {
            R.drawable.skizzekea,

    };

    private Button btntorna;

    private LinearLayout layoutInfo;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cerca);//main
        //la barra principale in alto di cerca
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        String [] nomi = {"Skizzekea"};
        String [] indirizzi={"Pub Inglese - Via Rossi n.56, Avellino \n 28 Luglio 2017 ore 22:00"};

        listView = (ListView)findViewById(R.id.mylistview);

        customAdapter = new CustomAdapterEvento(this, R.layout.cerca_locale_nome, new ArrayList<Evento>());

        listView.setAdapter(customAdapter);


        for (int i=0; i<nomi.length; i++) {
            Evento e = new Evento(
                    nomi[i],
                    indirizzi[i],
                    getResources().getDrawable(tabIcons[i]));
            customAdapter.add(e);
        }

        layoutInfo =(LinearLayout) findViewById(R.id.layoutevento);
        btntorna =(Button) findViewById(R.id.torna1);

    }

    public void onPictureClick(View v) {
        listView.setVisibility(View.INVISIBLE);
        layoutInfo.setVisibility(View.VISIBLE);
        btntorna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                layoutInfo.setVisibility(View.INVISIBLE);
                listView.setVisibility(View.VISIBLE);
            }
        });
    }

    public void onNameClick(View v) {
        listView.setVisibility(View.INVISIBLE);
        layoutInfo.setVisibility(View.VISIBLE);
        btntorna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                layoutInfo.setVisibility(View.INVISIBLE);
                listView.setVisibility(View.VISIBLE);
            }
        });
    }

    public void onIndClick(View v) {
        listView.setVisibility(View.INVISIBLE);
        layoutInfo.setVisibility(View.VISIBLE);
        btntorna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                layoutInfo.setVisibility(View.INVISIBLE);
                listView.setVisibility(View.VISIBLE);
            }
        });	}

}
