package com.example.fdeci.navbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fdeci on 17/06/2017.
 */

public class CustomAdapterEventi extends ArrayAdapter<EventoFabio> {

    public CustomAdapterEventi(Context context, int textViewResourceId,
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
        ImageView img = (ImageView) convertView.findViewById(R.id.immagineEvento);

        EventoFabio c = getItem(position);
        nome.setText(c.getNome());
        descrizione.setText(c.getDescrizione());
        img.setImageResource(c.getImg());

        return convertView;
    }

}