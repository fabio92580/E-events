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

public class RicercaCategoria extends AppCompatActivity {

    private Toolbar toolbar;
    public ListView listView;
    CustomAdapterEvento customAdapter;
    private int[] tabIcons = {
            R.drawable.jazz1,
            R.drawable.jazz2,
            R.drawable.concetto1,
            R.drawable.concetto2,

            R.drawable.concetto3,
            R.drawable.concetto4,

            R.drawable.gibson,
            R.drawable.burlesque,
            R.drawable.cocetto2,
            R.drawable.caraibici1,
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

        layoutInfo =(LinearLayout) findViewById(R.id.layoutevento);
        btntorna =(Button) findViewById(R.id.torna1);

        String [] nomi = {"Aperitivo a suon di Jazz",
                "Birth of the cool",
                "Schiavi di Abruzzo",
                "Musica...In tutti i sensi",
                "An aquarian Exposition",
        "La strada suona la festa della musica",
                "Gibson Festival",
                "Cena con Burlesque",
                "Musica nel casello - XVIII edizione",
                "Sabato Caraibico con DjTonib"};
        String [] indirizzi={"Centro benessere MyRea - via Salandra n.8 Roma \n12 Luglio 2017",
                "Teatrotenda -Piazza dell'Unità di Italia,Viterbo \n20 Agosto 2017",
                "L'Acquila \n28/29/30 Giugno 2017",
                "Arena di Verona \n5 Luglio 2017",
                "Milano \n15/16/17 Agosto 2017",
                "Piazze italiane \n21 Giugno 2017",
                "Musica Nuova - Via C.Battisti n.10 Roma \n5 Settembre 2017",
                "Chalet Quattropalme - L.Mare Sirena n. 43 Tortoreto \n21 agosto 2017",
                "Castello dei Doria - Dolceacqua \n5/7/9 Agosto 2017",
                "Lido Stella Marina - Reggio Calabria \nogni sabato da giugno a settembre 2017"};



        listView = (ListView)findViewById(R.id.mylistview);

        customAdapter = new CustomAdapterEvento(this, R.layout.cerca_evento_categoria, new ArrayList<Evento>());

        listView.setAdapter(customAdapter);
       // date[i],
        //String t="pizzeria";
        for (int i=0; i<nomi.length; i++) {
            Evento c = new Evento(
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
        });	}


    public void onNameClick(View v) {
        listView.setVisibility(View.INVISIBLE);
        layoutInfo.setVisibility(View.VISIBLE);
        btntorna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                layoutInfo.setVisibility(View.INVISIBLE);
                listView.setVisibility(View.VISIBLE);
            }
        });	}


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
