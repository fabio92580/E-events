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

public class HomeGestoreLocale extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Evento evento;
    private PropostaEvento propostaEvento;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_gestore_locale);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        final ListView listView = (ListView)findViewById(R.id.listViewDemo);
        List list = new LinkedList();
        list.add(new Evento("UNI Night - La Notte degli Hippie","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito"));
        list.add(new Evento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito"));
        list.add(new Evento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito"));
        list.add(new Evento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito"));
        list.add(new Evento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito"));
        list.add(new Evento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito"));
        CustomAdapterEventi adapter = new CustomAdapterEventi(this, R.layout.row, list);
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

                Intent openPage1 = new Intent(HomeGestoreLocale.this, DescrizioneEvento.class);
                startActivity(openPage1);
            }
        });

        final ListView listViewInviti = (ListView)findViewById(R.id.listViewProposte);
        List listInviti = new LinkedList();
        listInviti.add(new PropostaEvento("UNI Night - La Notte degli Hippie","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito"));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito"));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito"));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito"));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito"));
        listInviti.add(new PropostaEvento("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito"));
        CustomAdapterProposteEventi adapterInviti = new CustomAdapterProposteEventi(this, R.layout.row_proposte_eventi, listInviti);
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

                Intent openPage1 = new Intent(HomeGestoreLocale.this, DescrizioneEvento.class);
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
            Intent openPage1= new Intent(HomeGestoreLocale.this, CercaLocali.class);
            startActivity(openPage1);        }
        else if (id == R.id.nav_cerca_eventi) {
            Intent openPage1= new Intent(HomeGestoreLocale.this, CercaEventi.class);
            startActivity(openPage1);
        } else if (id == R.id.nav_accedi_registrati) {
            Intent openPage1= new Intent(HomeGestoreLocale.this, Accedi.class);
            startActivity(openPage1);
        }else if (id == R.id.nav_aggiungi_locale) {
            Intent openPage1= new Intent(HomeGestoreLocale.this, AggiungiLocale.class);
            startActivity(openPage1);
        }else if (id == R.id.nav_crea_evento) {
            Intent openPage1= new Intent(HomeGestoreLocale.this, CreaEvento.class);
            startActivity(openPage1);
        }else if (id == R.id.nav_proponi_evento) {
            Intent openPage1= new Intent(HomeGestoreLocale.this, ProponiEvento.class);
            startActivity(openPage1);
        }else if (id == R.id.nav_area_riservata) {
            Intent openPage1= new Intent(HomeGestoreLocale.this, DescrizionePR.class);
            startActivity(openPage1);
        }else if (id == R.id.nav_proposte) {
            Intent openPage1= new Intent(HomeGestoreLocale.this, ListaProposteEventi.class);
            startActivity(openPage1);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
