package com.example.fdeci.navbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/**
 * Created by fdeci on 30/05/2017.
 */

public class ScegliRegistrazione extends Activity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scegli_registrazione);

        spinner= (Spinner) findViewById(R.id.spinner);
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"Utente semplice", "Gestore locale", "PR" , "Servizio trasporti", "Servizio catering"});
        spinner.setAdapter((SpinnerAdapter) adapter);
    }

    public void annulla(View v){
        Intent openPage1= new Intent(ScegliRegistrazione.this, Accedi.class);
        startActivity(openPage1);
    }

    public void apriRegistrazione(View v){
        int item=spinner.getSelectedItemPosition();
        if(item==0) {
            Intent openPage1 = new Intent(ScegliRegistrazione.this, RegistraUtenteSemplice.class);
            startActivity(openPage1);
        }
        else if(item==1){
            Intent openPage1 = new Intent(ScegliRegistrazione.this, RegistraGestore.class);
            startActivity(openPage1);
        }
        else if(item==2){
            Intent openPage1 = new Intent(ScegliRegistrazione.this, RegistraPR.class);
            startActivity(openPage1);
        }
        else if(item==3){
            Intent openPage1 = new Intent(ScegliRegistrazione.this, RegistraTrasporti.class);
            startActivity(openPage1);
        }
        else if(item==4){
            Intent openPage1 = new Intent(ScegliRegistrazione.this, RegistraCatering.class);
            startActivity(openPage1);
        }
    }
}
