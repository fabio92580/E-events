package com.example.fdeci.navbar.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.fdeci.navbar.R;


public class TwoFragment extends Fragment{
    Button btnmodifica;
    ImageButton btncanc;
    ImageView dettagli;
    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootView= inflater.inflate(R.layout.fragment_eight,container, false);
        btnmodifica = (Button) rootView.findViewById(R.id.modifica);
        btnmodifica.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {

                // TODO Auto-generated method stub
                Intent redirect=new Intent(getActivity(),ModificaLocale1.class);
                getActivity().startActivity(redirect);

            }
        });
        btncanc=(ImageButton)rootView.findViewById(R.id.canc);
        btncanc.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View arg0) {
                                           //cancellare dalla lista
                                           String mess="Cancellato con successo";
                                           Toast toast= Toast.makeText(getActivity(), mess.toString(), Toast.LENGTH_LONG);
                                           toast.show();
                                       }
                                   }
        );
        dettagli=(ImageView) rootView.findViewById(R.id.imageView);
        dettagli.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {

                // TODO Auto-generated method stub
                Intent redirect=new Intent(getActivity(),InfoLocale.class);
                getActivity().startActivity(redirect);

            }
        });

        return rootView;
    }

}
