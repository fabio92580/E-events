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

public class HomeUtenteNonRegistrato extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private EventoFabio eventoFabio;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_utente_non_registrato);
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
        list.add(new EventoFabio("UNI Night - La Notte degli Hippie","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id1));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id2));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id3));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id4));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id5));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id6));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id7));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id8));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id9));
        list.add(new EventoFabio("disco","La musica arriva da un luogo divino e il meglio che si possa fare è cercare di raggiungere quel posto e lasciare che tutto scorra. La vita ruota attorno a quel luogo magico e pieno di fiori.\\n  Gli esami si avvicinano? Don't worry, be hippie!  \\n  Per una sera abbandona il tuo mondo e rivivi con noi gli anni hipster trasformandoti in un vero figlio dei fiori  \\n  Piccole magie colorate delizieranno la serata. Vedrai, lasceranno il segno... \\n  VI ASPETTANO MERCOLEDI 21 GIUGNO 2017 per la vostra Notte degli Hippie! \\n Double M | Via G. Di Martino | Fisciano | SA \\n Ingresso gratuito",id10));
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

                Intent openPage1 = new Intent(HomeUtenteNonRegistrato.this, DescrizioneEvento.class);
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
            Intent openPage1= new Intent(HomeUtenteNonRegistrato.this, CercaLocale.class);
            startActivity(openPage1);        }
        else if (id == R.id.nav_cerca_eventi) {
            Intent openPage1= new Intent(HomeUtenteNonRegistrato.this, CercaEvento.class);
            startActivity(openPage1);
        } else if (id == R.id.nav_accedi_registrati) {
            Intent openPage1= new Intent(HomeUtenteNonRegistrato.this, Accedi.class);
            startActivity(openPage1);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
