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

public class ListaNotifiche extends Activity {
    private Notifica evento;
    private String str;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_eventi);

        int id1 = getResources().getIdentifier("evento1", "drawable", getPackageName());
        int id2 = getResources().getIdentifier("evento2", "drawable", getPackageName());
        int id3 = getResources().getIdentifier("evento3", "drawable", getPackageName());
        int id4 = getResources().getIdentifier("evento4", "drawable", getPackageName());
        int id5 = getResources().getIdentifier("evento5", "drawable", getPackageName());
        int id6 = getResources().getIdentifier("evento6", "drawable", getPackageName());
        int id7 = getResources().getIdentifier("evento7", "drawable", getPackageName());
        int id8 = getResources().getIdentifier("evento8", "drawable", getPackageName());
        int id9 = getResources().getIdentifier("evento9", "drawable", getPackageName());
        int id10 = getResources().getIdentifier("evento10", "drawable", getPackageName());

        final ListView listView = (ListView)findViewById(R.id.listViewDemo);
        List list = new LinkedList();
        List listInviti = new LinkedList();
        listInviti.add(new Notifica("UNI Night - La Notte degli Hippie","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito","caraibico",id1));
        listInviti.add(new Notifica("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito","jazz",id2));
        listInviti.add(new Notifica("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito","rock",id3));
        listInviti.add(new Notifica("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito","disco",id4));
        listInviti.add(new Notifica("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito","house",id5));
        listInviti.add(new Notifica("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito","jazz",id6));
        listInviti.add(new Notifica("UNI Night - La Notte degli Hippie","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito","caraibico",id7));
        listInviti.add(new Notifica("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito","jazz",id8));
        listInviti.add(new Notifica("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito","rock",id9));
        listInviti.add(new Notifica("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito","disco",id10));
        CustomAdapterNotifiche adapter = new CustomAdapterNotifiche(this, R.layout.row_notifica_inviti, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                evento = (Notifica) listView.getItemAtPosition(position);
                str=evento.getNome();
                // Show Toast
                Toast.makeText(getApplicationContext(),
                        "Click su posizione n."+position+": " +str, Toast.LENGTH_LONG)
                        .show();

                Intent openPage1 = new Intent(ListaNotifiche.this, DescrizioneEvento.class);
                startActivity(openPage1);
            }
        });

    }
}
