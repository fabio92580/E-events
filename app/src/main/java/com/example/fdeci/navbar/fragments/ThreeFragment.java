package com.example.fdeci.navbar.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.fdeci.navbar.R;


public class ThreeFragment extends Fragment{
    Button btnmodifica, btninvita, btnrichieste;
    ImageButton canc;
    public ThreeFragment() {
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
        View rootView= inflater.inflate(R.layout.fragment_six, container, false);
        btnmodifica = (Button) rootView.findViewById(R.id.modifica);
        btnmodifica.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {

                // TODO Auto-generated method stub
                Intent redirect=new Intent(getActivity(),ModificaEvento1.class);
                getActivity().startActivity(redirect);

            }
        });
        btnrichieste = (Button) rootView.findViewById(R.id.richieste);
        btnrichieste.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {

                // TODO Auto-generated method stub
                Intent redirect=new Intent(getActivity(),RichiestePR.class);
                getActivity().startActivity(redirect);

            }
        });
        btninvita = (Button) rootView.findViewById(R.id.invita);
        btninvita.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {

                // TODO Auto-generated method stub
                Intent redirect=new Intent(getActivity(),InvitaPR.class);
                getActivity().startActivity(redirect);

            }
        });
        canc=(ImageButton) rootView.findViewById(R.id.canc);
        canc.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View arg0) {
                                            //cancellare dalla lista
                                            String mess="Cancellato con successo";
                                            Toast toast= Toast.makeText(getActivity(), mess.toString(), Toast.LENGTH_LONG);
                                            toast.show();
                                        }
                                    }
        );
        return rootView;
    }

}
