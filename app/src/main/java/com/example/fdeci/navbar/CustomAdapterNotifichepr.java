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

public class CustomAdapterNotifichepr extends ArrayAdapter<Notifica> {

    public CustomAdapterNotifichepr(Context context, int textViewResourceId,
                                    List objects) {
        super(context, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row_notifica, null);
        TextView nome = (TextView)convertView.findViewById(R.id.textViewName);
        TextView proposta = (TextView)convertView.findViewById(R.id.textViewProposta);
        TextView categoria = (TextView)convertView.findViewById(R.id.textViewCategoria);
        ImageView img = (ImageView) convertView.findViewById(R.id.immagineEvento);

        Notifica c = getItem(position);
        nome.setText(c.getNome());
        proposta.setText(c.getDescrizione());
        categoria.setText(c.getCategoria());
        img.setImageResource(c.getImg());

        return convertView;
    }

}