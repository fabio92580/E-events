package com.example.fdeci.navbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.fdeci.navbar.R;
/**
 * Created by Martina on 21/06/2017.
 */

public class VisualizzaTendenze  extends AppCompatActivity {
    private Toolbar toolbar;
    private Button btnclassificaNazionale, btnLocale;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classifica);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnclassificaNazionale = (Button) findViewById(R.id.classificaNazionale);
        btnclassificaNazionale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent classifica = new Intent(VisualizzaTendenze.this, ClassificaNazionale.class);
                startActivity(classifica);

            }
        });
        btnLocale = (Button) findViewById(R.id.classificaLocale);
        btnLocale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent classifica = new Intent(VisualizzaTendenze.this, ClassificaLocale.class);
                startActivity(classifica);

            }
        });
    }
}
