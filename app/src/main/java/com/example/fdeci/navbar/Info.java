package com.example.fdeci.navbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by fdeci on 30/05/2017.
 */

public class Info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void esci(View v){
        Intent openPage1= new Intent(Info.this, Accedi.class);
        startActivity(openPage1);
    }
}
