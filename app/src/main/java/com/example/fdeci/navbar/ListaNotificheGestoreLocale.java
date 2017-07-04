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

public class ListaNotificheGestoreLocale extends Activity {
    private EventoFabio eventoFabio;
    private EventoPR notifica;
    private InvitoPR invito;
    private String str;
    private PropostaEvento propostaEvento;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_notifiche_gestore_locale);

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
        list.add(new InvitoPR("Marco Torrecuso","Serata a bordo piscina","Ciao, ti aspetto Sabato a questa bellissima festa",pr1));
        list.add(new InvitoPR("Marco Torrecuso","Serata a bordo piscina","Ciao, ti aspetto Sabato a questa bellissima festa",pr2));
        list.add(new InvitoPR("Marco Torrecuso","Serata a bordo piscina","Ciao, ti aspetto Sabato a questa bellissima festa",pr3));
        list.add(new InvitoPR("Marco Torrecuso","Serata a bordo piscina","Ciao, ti aspetto Sabato a questa bellissima festa",pr4));
        list.add(new InvitoPR("Marco Torrecuso","Serata a bordo piscina","Ciao, ti aspetto Sabato a questa bellissima festa",pr5));
        list.add(new InvitoPR("Marco Torrecuso","Serata a bordo piscina","Ciao, ti aspetto Sabato a questa bellissima festa",pr6));
        list.add(new InvitoPR("Marco Torrecuso","Serata a bordo piscina","Ciao, ti aspetto Sabato a questa bellissima festa",pr7));
        list.add(new InvitoPR("Marco Torrecuso","Serata a bordo piscina","Ciao, ti aspetto Sabato a questa bellissima festa",pr8));
        list.add(new InvitoPR("Marco Torrecuso","Serata a bordo piscina","Ciao, ti aspetto Sabato a questa bellissima festa",pr9));
        list.add(new InvitoPR("Marco Torrecuso","Serata a bordo piscina","Ciao, ti aspetto Sabato a questa bellissima festa",pr10));

        CustomAdapterInvitiPR adapter = new CustomAdapterInvitiPR(this, R.layout.row_notifica_inviti_pr, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                invito = (InvitoPR) listView.getItemAtPosition(position);
                str=invito.getNomeEvento();
                // Show Toast
                Toast.makeText(getApplicationContext(),
                        "Click su posizione n."+position+": " +str, Toast.LENGTH_LONG)
                        .show();

                Intent openPage1 = new Intent(ListaNotificheGestoreLocale.this, DescrizioneEvento.class);
                startActivity(openPage1);
            }
        });

        final ListView listViewInviti = (ListView)findViewById(R.id.listViewInviti);
        List listInviti = new LinkedList();
        listInviti.add(new EventoPR("Marco Torrecuso", "Serata a bordo piscina"));
        listInviti.add(new EventoPR("Marco Torrecuso", "Serata a bordo piscina"));
        listInviti.add(new EventoPR("Marco Torrecuso", "Serata a bordo piscina"));
        listInviti.add(new EventoPR("Marco Torrecuso", "Serata a bordo piscina"));
        listInviti.add(new EventoPR("Marco Torrecuso", "Serata a bordo piscina"));
        CustomAdapterEventiAccettati adapterInviti = new CustomAdapterEventiAccettati(this, R.layout.row_inviti_pr_accettati, listInviti);
        listViewInviti.setAdapter(adapterInviti);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                notifica = (EventoPR) listViewInviti.getItemAtPosition(position);
                str=notifica.getNomeEvento();
                // Show Toast
                Toast.makeText(getApplicationContext(),
                        "Click su posizione n."+position+": " +str, Toast.LENGTH_LONG)
                        .show();

                Intent openPage1 = new Intent(ListaNotificheGestoreLocale.this, DescrizioneEvento.class);
                startActivity(openPage1);
            }
        });



    }
}
