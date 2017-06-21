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

public class CustomAdapterInvitiEventi extends ArrayAdapter<PropostaEvento> {

    public CustomAdapterInvitiEventi(Context context, int textViewResourceId,
                                     List objects) {
        super(context, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row_inviti_eventi, null);
        TextView nome = (TextView)convertView.findViewById(R.id.textViewName);
        TextView proposta = (TextView)convertView.findViewById(R.id.textViewProposta);

        PropostaEvento c = getItem(position);
        nome.setText(c.getNome());
        proposta.setText(c.getProposta());
        return convertView;
    }

}