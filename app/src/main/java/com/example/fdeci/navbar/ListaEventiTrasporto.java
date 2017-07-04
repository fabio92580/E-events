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

public class ListaEventiTrasporto extends Activity {
    private EventoFabio eventoFabio;
    private String str;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_eventi);
        int id = getResources().getIdentifier("ragazzo", "drawable", getPackageName());

        final ListView listView = (ListView)findViewById(R.id.listViewDemo);
        List list = new LinkedList();
        list.add(new EventoFabio("UNI Night - La Notte degli Hippie","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id));
        CustomAdapterEventi adapter = new CustomAdapterEventi(this, R.layout.row, list);
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

                Intent openPage1 = new Intent(ListaEventiTrasporto.this, DescrizioneEvento.class);
                startActivity(openPage1);
            }
        });

    }
}
