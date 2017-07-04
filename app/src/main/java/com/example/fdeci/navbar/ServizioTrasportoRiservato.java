package com.example.fdeci.navbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.fdeci.navbar.R;



/**
 * Created by Martina on 20/06/2017.
 */

public class ServizioTrasportoRiservato extends AppCompatActivity {

    private Toolbar toolbar;
    private Button avanti, btnfotocamera, btndisattiva, btnannulla;
    private static final int CAMERA_REQUEST = 123;
    private ImageView imageView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilotrasporto);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        avanti =(Button) findViewById(R.id.avanti);
        avanti.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {

                // TODO Auto-generated method stub
                Intent redirect=new Intent(ServizioTrasportoRiservato.this, ServizioTrasportoRiservato2.class);
                startActivity(redirect);

            }
        });
        imageView = (ImageView) findViewById(R.id.imageView6);

        btnfotocamera = (Button) findViewById(R.id.cambiaImmagine);
        btnfotocamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent
                        (android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });


        btndisattiva= (Button) findViewById(R.id.cancAccount);
        btndisattiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //salvare gli aggiornamenti nel database User
                //diciamo che è andata bene con un Toast
                String mess = "Account cancellato";
                Toast toast = Toast.makeText(ServizioTrasportoRiservato.this, mess.toString(), Toast.LENGTH_LONG);
                toast.show();
            }
        });

        btnannulla =(Button) findViewById(R.id.annulla);
        btnannulla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent redirect = new Intent(ServizioTrasportoRiservato.this, MainActivity.class);
                startActivity(redirect);
            }
        });

    }
    public void onActivityResult (int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }

}
