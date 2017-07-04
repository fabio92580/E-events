package com.example.fdeci.navbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

public class HomePR extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private EventoFabio eventoFabio;
    private PropostaEvento propostaEvento;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pr);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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

                Intent openPage1 = new Intent(HomePR.this, DescrizioneEvento.class);
                startActivity(openPage1);
            }
        });


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

        final ListView listViewInviti = (ListView)findViewById(R.id.listViewInviti);
        List listInviti = new LinkedList();
        listInviti.add(new PropostaEvento("UNI Night - La Notte degli Hippie","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",pr1));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",pr2));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",pr3));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",pr4));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",pr5));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",pr6));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",pr7));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",pr8));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",pr9));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",pr10));
        CustomAdapterInvitiEventi adapterInviti = new CustomAdapterInvitiEventi(this, R.layout.row_inviti_eventi, listInviti);
        listViewInviti.setAdapter(adapterInviti);


        listViewInviti.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                propostaEvento = (PropostaEvento) listViewInviti.getItemAtPosition(position);
                str=propostaEvento.getNome();
                // Show Toast
                Toast.makeText(getApplicationContext(),
                        "Click su posizione n."+position+": " +str, Toast.LENGTH_LONG)
                        .show();

                Intent openPage1 = new Intent(HomePR.this, DescrizioneEvento.class);
                startActivity(openPage1);
            }
        });


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }





    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_cerca_locali) {
            Intent openPage1= new Intent(HomePR.this, CercaLocale.class);
            startActivity(openPage1);        }
        else if (id == R.id.nav_cerca_eventi) {
            Intent openPage1= new Intent(HomePR.this, CercaEvento.class);
            startActivity(openPage1);
        } else if (id == R.id.nav_accedi_registrati) {
            Intent openPage1= new Intent(HomePR.this, Accedi.class);
            startActivity(openPage1);
        }else if (id == R.id.nav_area_riservata) {
            Intent openPage1= new Intent(HomePR.this, HomePR.class);
            startActivity(openPage1);
        }else if (id== R.id.nav_notifiche){
            Intent openPage1= new Intent(HomePR.this, ListaNotifichePR.class);
            startActivity(openPage1);
        }else if (id == R.id.nav_eventi_prenotati) {
            Intent openPage1= new Intent(HomePR.this, ListaEventi.class);
            startActivity(openPage1);
        }else if (id == R.id.nav_impostazioni_eventi) {
            Intent openPage1= new Intent(HomePR.this, HomePR.class);
            startActivity(openPage1);
        }else if (id == R.id.nav_impostazioni_locali) {
            Intent openPage1= new Intent(HomePR.this, HomePR.class);
            startActivity(openPage1);
        }else if (id == R.id.nav_candidati) {
            Intent openPage1= new Intent(HomePR.this, ListaCandidatiEventiPR.class);
            startActivity(openPage1);
        }else if (id == R.id.nav_gestisci_eventi_pr) {
            Intent openPage1= new Intent(HomePR.this, HomePR.class);
            startActivity(openPage1);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
