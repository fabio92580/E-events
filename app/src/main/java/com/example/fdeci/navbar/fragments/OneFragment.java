package com.example.fdeci.navbar.fragments;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.fdeci.navbar.R;
import com.example.fdeci.navbar.MainActivity;

import static android.app.Activity.RESULT_OK;


public class OneFragment extends Fragment{
    Button btnconferma, btnfotocamera,btndisattiva;

    //per la fotocamera
    private static final int CAMERA_REQUEST = 123;
    private ImageView imageView;


    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }



    //protecte
   public void onActivityResult (int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_seven, container,   false);

       // Toast toast;
        btnconferma = (Button) rootView.findViewById(R.id.button2);
        btnconferma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                //salvare gli aggiornamenti nel database User
                //diciamo che è andata bene con un Toast
                String mess="Modifiche apportate con successo";
                Toast toast= Toast.makeText(getActivity(), mess.toString(), Toast.LENGTH_LONG);
                toast.show();
               // toast.setGravity(Gravity.TOP|Gravity.CENTER,200,200);


            }
        });


        imageView = (ImageView)rootView.findViewById(R.id.imageProfilo);
        btnfotocamera = (Button) rootView.findViewById(R.id.button5);
        btnfotocamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                               Intent cameraIntent = new Intent
                        (MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });


        btndisattiva= (Button) rootView.findViewById(R.id.button4);
        btndisattiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //salvare gli aggiornamenti nel database User
                //diciamo che è andata bene con un Toast
                String mess = "Account cancellato";
                Toast toast = Toast.makeText(getActivity(), mess.toString(), Toast.LENGTH_LONG);
                toast.show();
            }
        });
        return rootView;



    }


}
