package com.example.fdeci.navbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    //private Button btnSimpleTabs, btnScrollableTabs, btnIconTabs, btnCustomIconTextTabs;
    private Button btnIconTextTabs,btnCustomIconTextTabs, btntrasporto, btncatering, btntendenze;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       // btnSimpleTabs = (Button) findViewById(R.id.btnSimpleTabs);
       // btnScrollableTabs = (Button) findViewById(R.id.btnScrollableTabs);
        btnIconTextTabs = (Button) findViewById(R.id.btnIconTextTabs);
        //btnIconTabs = (Button) findViewById(R.id.btnIconTabs);
        btnCustomIconTextTabs = (Button) findViewById(R.id.btnCustomIconTabs);
        btncatering =(Button) findViewById(R.id.btncatering);
        btntrasporto=(Button) findViewById(R.id.btntrasporto);
        btntendenze=(Button) findViewById(R.id.btntendenze);
       // btnSimpleTabs.setOnClickListener(this);
        //btnScrollableTabs.setOnClickListener(this);
        btnIconTextTabs.setOnClickListener(this);
        //btnIconTabs.setOnClickListener(this);
        btnCustomIconTextTabs.setOnClickListener(this);
        btncatering.setOnClickListener(this);
        btntrasporto.setOnClickListener(this);
        btntendenze.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnIconTextTabs:
                startActivity(new Intent(MainActivity.this, AreaRiservataGestore.class));
                break;
            case R.id.btnCustomIconTabs:
                startActivity(new Intent(MainActivity.this, CustomViewIconTextTabsActivity.class));
                break;
            case R.id.btntrasporto:
                startActivity(new Intent(MainActivity.this, ServizioTrasportoRiservato.class));
                break;
            case R.id.btncatering:
                startActivity(new Intent (MainActivity.this, ServizioCateringRiservato.class));
                break;
            case R.id.btntendenze:
                startActivity(new Intent (MainActivity.this, VisualizzaTendenze.class));
                break;
        }
    }
}
