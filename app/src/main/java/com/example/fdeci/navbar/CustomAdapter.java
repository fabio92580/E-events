package com.example.fdeci.navbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fdeci on 17/06/2017.
 */

public class CustomAdapter extends ArrayAdapter<Evento> {

    public CustomAdapter(Context context, int textViewResourceId,
                         List objects) {
        super(context, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row, null);
        TextView nome = (TextView)convertView.findViewById(R.id.textViewName);
        TextView descrizione = (TextView)convertView.findViewById(R.id.textViewDescription);
        Evento c = getItem(position);
        nome.setText(c.getNome());
        descrizione.setText(c.getDescrizione());
        return convertView;
    }

}