package com.example.fdeci.navbar;

/**
 * Created by Martina on 23/06/2017.
 */
import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;


public class CustomAdapter extends ArrayAdapter<Locale> {
    private int resource;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, int resourceId, List<Locale> objects) {
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

        Locale c = getItem(position);

        Log.d("DEBUG","locale c="+c);

        Button nameButton;
        Button indirizzoButton;
        ImageButton fotoButton;

        nameButton = (Button) v.findViewById(R.id.elem_lista_nome);
        indirizzoButton = (Button) v.findViewById(R.id.elem_lista_indirizzo);
        fotoButton = (ImageButton) v.findViewById(R.id.elem_lista_foto);

        fotoButton.setImageDrawable(c.getPicture());
        nameButton.setText(c.getName());
        indirizzoButton.setText(c.getIndirizzo());

        fotoButton.setTag(position);
        nameButton.setTag(position);
        indirizzoButton.setTag(position);

        return v;
    }
}

