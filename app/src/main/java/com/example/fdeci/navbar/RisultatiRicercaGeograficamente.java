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
 * Created by Martina on 22/06/2017.
 */

public class RisultatiRicercaGeograficamente extends AppCompatActivity {
    private Button btntorna;

    private LinearLayout layoutInfo;
    private Toolbar toolbar;
    public ListView listView;
    CustomAdapter customAdapter;
    private int[] tabIcons = {
            R.drawable.pizza1,
            R.drawable.pizza4,
            R.drawable.pizza2,
            R.drawable.pizza1,
            R.drawable.pizza3,
            R.drawable.pizza4,
    };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cerca);//main
       //la barra principale in alto di cerca
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        String [] nomi = {"Antonio&Antonio", "Fofò", "Mama mia","Regina Margherita","Sorbillo","12 Morsi" };
        String [] indirizzi={"Via Mergellina n.89, Napoli", "Via Corso Emanuele Vittorio n.160, Napoli", "Via Corso Umberto n.189, Napoli","Via Mergellina n.10, Napoli","Via Unità d'Italia n.56, Napoli", "Via Vomero n.129, Napoli"};

        listView = (ListView)findViewById(R.id.mylistview);

        customAdapter = new CustomAdapter(this, R.layout.cerca_locale_geograficamente, new ArrayList<Locale>());

        listView.setAdapter(customAdapter);


        //String t="pizzeria";
        for (int i=0; i<nomi.length; i++) {
            Locale c = new Locale(
                    nomi[i],
                    indirizzi[i],

                    getResources().getDrawable(tabIcons[i]));
            customAdapter.add(c);
        }

        layoutInfo =(LinearLayout) findViewById(R.id.layoutinfo);
        btntorna =(Button) findViewById(R.id.torna);


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
        });
    }

}
