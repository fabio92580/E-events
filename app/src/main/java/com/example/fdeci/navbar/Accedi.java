package com.example.fdeci.navbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Accedi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accedi_registrati);
    }

    public void apriLogin(View v){
        Intent openPage1= new Intent(Accedi.this, Login.class);
        startActivity(openPage1);
    }

    public void apriRegistrati(View v){
        Intent openPage1= new Intent(Accedi.this, ScegliRegistrazione.class);
        startActivity(openPage1);
    }

    public void apriInfo(View v){
        Intent openPage1= new Intent(Accedi.this, Info.class);
        startActivity(openPage1);
    }
}
