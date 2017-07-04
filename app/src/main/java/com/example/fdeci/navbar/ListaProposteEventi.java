package com.example.fdeci.navbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by fdeci on 19/06/2017.
 */

public class ListaProposteEventi extends Activity {
    private EventoFabio eventoFabio;
    private String str;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_proposte_eventi);


        int pr1 = getResources().getIdentifier("pr1", "drawable", getPackageName());
        int pr2 = getResources().getIdentifier("pr2", "drawable", getPackageName());
        int pr3 = getResources().getIdentifier("pr3", "drawable", getPackageName());
        int pr4 = getResources().getIdentifier("pr4", "drawable", getPackageName());
        int pr5 = getResources().getIdentifier("pr5", "drawable", getPackageName());
        int pr6 = getResources().getIdentifier("pr6", "drawable", getPackageName());
        int pr7 = getResources().getIdentifier("pr7", "drawable", getPackageName());
        int pr8 = getResources().getIdentifier("pr8", "drawable", getPackageName());
        int pr9 = getResources().getIdentifier("pr9", "drawable", getPackageName());
        int pr10 = getResources().getIdentifier("pr10", "drawable", getPackageName());


        final ListView listView = (ListView)findViewById(R.id.listViewDemo);
        List list = new LinkedList();
        list.add(new PropostaEvento("Antonio Cataldo" ,"Si potrebbe organizzare una braciata",pr1));
        list.add(new PropostaEvento("Fabio De Stefano", "Perchè non fare una serata a tema?",pr2));
        list.add(new PropostaEvento("Giuseppe D'Argenio", "Mi piacerebbe partecipare ad un Silent Party",pr3));
        list.add(new PropostaEvento("Corrado Ciampa", "Perchè non organizziamo una serata Jazz????",pr4));
        list.add(new PropostaEvento("Enzo Rossi", "Quanto vorrei farmi una serata caraibica tutta a base di salsa",pr5));
        list.add(new PropostaEvento("Stefano Maffei", "A chi piacerebbe una serata con un gruppetto rock?",pr6));





        CustomAdapterProposteEventi adapter = new CustomAdapterProposteEventi(this, R.layout.row_proposte_eventi, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                eventoFabio = (EventoFabio) listView.getItemAtPosition(position);
                str= eventoFabio.getNome();
                // Show Toast
                Toast.makeText(getApplicationContext(),
                        "Click su posizione n."+position+": " +str, Toast.LENGTH_LONG)
                        .show();

                Intent openPage1 = new Intent(ListaProposteEventi.this, DescrizioneEvento.class);
                startActivity(openPage1);
            }
        });

    }
}
