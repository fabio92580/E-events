package com.example.fdeci.navbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ArrowKeyMovementMethod;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;



/**
 * Created by Martina on 22/06/2017.
 */

public class RisultatiRicercaNome extends AppCompatActivity {

    private Toolbar toolbar;
    public ListView listView;
    CustomAdapter customAdapter;
    private Button btntorna;

    private LinearLayout layoutInfo;
    private int[] tabIcons = {
            R.drawable.letterario0,
            R.drawable.letterario4,
            R.drawable.letterario0,
            R.drawable.letterario5,
            R.drawable.letterario6,
    };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cerca);//main
        //la barra principale in alto di cerca
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        String [] nomi = {"Caffè Lettarario", "Bar Lettarario", "Caffè Lettarario 2","Caffetteria Lettarario","Lettarario Caffè"};
        String [] indirizzi={"Via Corso Trieste n.89, Caserta", "Via G.Rossini n.16, Pisa", "Via Corso Umberto n.189, Napoli","Via Salerno n.10, Milano","Via Unità d'Italia n.56, Roma"};

        listView = (ListView)findViewById(R.id.mylistview);

        customAdapter = new CustomAdapter(this, R.layout.cerca_locale_nome, new ArrayList<Locale>());

        listView.setAdapter(customAdapter);


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
        /*Log.d("DEBUG", "Picture has been clicked: position=" + v.getTag());
        int position = Integer.parseInt(v.getTag().toString());
        Locale c = customAdapter.getItem(position);
        Toast.makeText(getApplicationContext(),
                "Click su Foto - posizione n."+position+": " +c.getName(), Toast.LENGTH_LONG)
                .show();*/

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
        /*Log.d("DEBUG","Name has been clicked position="+v.getTag());
        int position = Integer.parseInt(v.getTag().toString());
        Locale c = customAdapter.getItem(position);
        Toast.makeText(getApplicationContext(),
                "Click su Nome - posizione n." + position + ": " + c.getName(), Toast.LENGTH_LONG)
                .show();*/
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
        /*Log.d("DEBUG","Tel has been clicked position="+v.getTag());
        int position = Integer.parseInt(v.getTag().toString());
        Locale c = customAdapter.getItem(position);
        Toast.makeText(getApplicationContext(),
                "Click su Indirizzo - posizione n."+position+": " +c.getName(), Toast.LENGTH_LONG)
                .show();	*/
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
