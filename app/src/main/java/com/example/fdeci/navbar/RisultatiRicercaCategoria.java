package com.example.fdeci.navbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by Martina on 22/06/2017.
 */

public class RisultatiRicercaCategoria extends AppCompatActivity {

    private Toolbar toolbar;
    public ListView listView;
    CustomAdapter customAdapter;
    private Button btntorna;

    private LinearLayout layoutInfo;
    private int[] tabIcons = {
            R.drawable.pizza1,
            R.drawable.pizza4,
            R.drawable.pizza2,
            R.drawable.pizza1,
            R.drawable.pizza3,
            R.drawable.pizza4,
            R.drawable.pizza1,
            R.drawable.pizza4,
            R.drawable.pizza2,
            R.drawable.pizza1,
            R.drawable.pizza3,
            R.drawable.pizza4,
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

        layoutInfo =(LinearLayout) findViewById(R.id.layoutinfo);
        btntorna =(Button) findViewById(R.id.torna);


        String [] nomi = {"Sorbillo", "Fofò", "Mama mia","Regina Margherita","Don Giovanni",
                "12 Morsi","Antonio&Antonio", "Pepe Nero", "Tre Farine","Meb","Punto 17","I Masanielli",
                "I due forchettoni", "Tre fratelli", "Morsi e rimorsi","Nanine","La Loggetta","SunRise"};
        String [] indirizzi={"Via Mergellina n.89, Napoli", "Via Corso Emanuele Vittorio n.160, Milano",
                "Via Corso Umberto n.189, Roma","Via Mergellina n.10, Napoli","Via Unità d'Italia n.56, Verona",
                "Via Vomero n.129, Napoli","Via Mergellina n.89, Napoli", "Via Corso Emanuele Vittorio n.160, Torino",
                "Via Corso Umberto n.189, Torino","Via Mergellina n.10, Napoli","Via Unità d'Italia n.56, Bologna",
                "Via Corso Novara n.129, Firenze","Via Verdi n.89, Venezia", "Via Corso Vittoria n.160, Palermo",
                "Via Corso Umberto n.189, Palermo","Via Rossi n.10, Catanea","Via Unità d'Italia n.56, Bari",
                "Via Verdi n.129,Latina"};



        listView = (ListView)findViewById(R.id.mylistview);

        customAdapter = new CustomAdapter(this, R.layout.cerca_locale_categoria, new ArrayList<Locale>());

        listView.setAdapter(customAdapter);


        //String t="pizzeria";
        for (int i=0; i<nomi.length; i++) {
            Locale c = new Locale(
                    nomi[i],
                    indirizzi[i],

                    getResources().getDrawable(tabIcons[i]));
            customAdapter.add(c);
        }

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
