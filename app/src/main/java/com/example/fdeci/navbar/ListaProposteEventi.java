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
    private Evento evento;
    private String str;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_proposte_eventi);

        final ListView listView = (ListView)findViewById(R.id.listViewDemo);
        List list = new LinkedList();
        list.add(new PropostaEvento("Antonio Cataldo" ,"Si potrebbe organizzare una braciata"));
        list.add(new PropostaEvento("Fabio De Stefano", "Perchè non fare una serata a tema?"));
        list.add(new PropostaEvento("Giuseppe D'Argenio", "Mi piacerebbe partecipare ad un Silent Party"));
        list.add(new PropostaEvento("Corrado Ciampa", "Perchè non organizziamo una serata Jazz????"));
        list.add(new PropostaEvento("Enzo Rossi", "Quanto vorrei farmi una serata caraibica tutta a base di salsa"));
        list.add(new PropostaEvento("Stefano Maffei", "A chi piacerebbe una serata con un gruppetto rock?"));



        CustomAdapterProposteEventi adapter = new CustomAdapterProposteEventi(this, R.layout.row_proposte_eventi, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                evento = (Evento) listView.getItemAtPosition(position);
                str=evento.getNome();
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
