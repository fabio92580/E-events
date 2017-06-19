package com.example.fdeci.navbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

/**
 * Created by fdeci on 09/06/2017.
 */

public class AggiungiLocale extends Activity {
    private Spinner spinnerRegioni;
    private Spinner spinnerProvince;


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aggiungi_locale1);

        spinnerRegioni= (Spinner) findViewById(R.id.spinnerRegioni);
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"Abruzzo", "Basilicata",
                "Calabria" , "Campania", "Emilia Romagna", "Friuli Venezia Giulia", "Lazio", "Liguria", "Lombardia", "Marche", "Molise",
                "Piemonte", "Puglia", "Sardegna", "Sicilia", "Toscana", "Trentino Alto Adige", "Umbria" , "Valle d'Aosta", "Veneto"});
        spinnerRegioni.setAdapter((SpinnerAdapter) adapter);
        inizializzaSpinner();
    }

    public void avantiUno(View v){

        setContentView(R.layout.activity_aggiungi_locale2);


    }

    public void inizializzaSpinner(){
        spinnerProvince= (Spinner) findViewById(R.id.spinnerProvince);


        int item=spinnerRegioni.getSelectedItemPosition();
        if(item==0) {
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"AQ", "TE", "PH" , "CH"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==1){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"PZ", "MT"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==2){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"CS", "CZ", "RC" , "KR", "VV"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==3){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"CE", "BN", "NA" , "AV", "SA"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==4){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"PC","PR", "RE", "MO" , "BO", "FE", "RA", "FO", "RN"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==5){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"UD", "GO", "TS" , "PN"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==6){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"VT", "RI", "RM" , "LT", "FR"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==7){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"IM", "SV", "GE" , "SP", "PC"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==8){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"VA", "CO", "SO" , "MI", "BG", "BS", "PV", "CR","MN","LC","LO"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==9){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"AN", "MC", "AP" , "PS"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==10){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"CB", "IS"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==11){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"TO", "VC", "NO" , "CN", "AT", "AL", "BI", "VB"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==12){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"FG", "BA", "TA" , "BR", "LE"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==13){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"SS", "NU", "CA" , "OR"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==14){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"TP", "PA", "ME" , "AG", "CL", "EN", "CT", "RG", "SR"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==15){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"MS", "LU", "PT" , "FI", "LI", "PI", "AR", "SI", "GR","PO"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==16){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"BZ", "TN"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==17){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"PG", "TR"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==18){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"AO"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }
        else if(item==19){
            ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"VR", "BI", "BL" , "TV", "VE", "PD", "RO"});
            spinnerProvince.setAdapter((SpinnerAdapter) adapter1);
        }

    }

    public void annulla(View v){
        Intent openPage1= new Intent(AggiungiLocale.this, Accedi.class);
        startActivity(openPage1);
    }


    public void avantiDue(View v){
        setContentView(R.layout.activity_aggiungi_locale3);
    }
    public void indietroDue(View v){
        setContentView(R.layout.activity_aggiungi_locale1);
    }

    public void indietroTre(View v){
        setContentView(R.layout.activity_aggiungi_locale2);
    }

    public void conferma(View v){
        Toast.makeText(this, "Registrazione avvenuta con successo!", Toast.LENGTH_SHORT).show();
        Intent openPage1= new Intent(AggiungiLocale.this, Home.class);
        startActivity(openPage1);
    }


}
