package com.example.fdeci.navbar;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.List;



/**
 * Created by Martina on 23/06/2017.
 */

public class CustomAdapterEvento extends ArrayAdapter<Evento> {
    private int resource;
    private LayoutInflater inflater;


    public CustomAdapterEvento(Context context, int resourceId, List<Evento> objects) {
        super(context, resourceId, objects);
        resource = resourceId;
        inflater = LayoutInflater.from(context);
    }



    @Override
    public View getView(int position, View v, ViewGroup parent) {
        if (v == null) {
            Log.d("DEBUG","Inflating view");
            v = inflater.inflate(R.layout.cerca_locale_geograficamente, null);
        }

        Evento e = getItem(position);

        Log.d("DEBUG","evento c="+e);

        Button nameButton;
        Button indirizzoButton;
        //Button quandoButton;
        ImageButton fotoButton;

        nameButton = (Button) v.findViewById(R.id.elem_lista_nome);
        indirizzoButton = (Button) v.findViewById(R.id.elem_lista_indirizzo);
        //quandoButton=(Button) v.findViewById(R.id.elem_lista_date);
        fotoButton = (ImageButton) v.findViewById(R.id.elem_lista_foto);

        fotoButton.setImageDrawable(e.getPicture());
        nameButton.setText(e.getName());
        //quandoButton.setText(e.getData());
        indirizzoButton.setText(e.getIndirizzo());

        fotoButton.setTag(position);
        nameButton.setTag(position);
        //quandoButton.setTag(position);
        indirizzoButton.setTag(position);

        return v;
    }
}

