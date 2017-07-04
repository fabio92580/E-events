package com.example.fdeci.navbar;

import android.graphics.drawable.Drawable;

/**
 * Created by Martina on 23/06/2017.
 */

public class Evento {

        private String name;
        private String indirizzo;
        private Drawable picture;
        private String data;

    public Evento(String n, String t, Drawable f) {
        this.name = n;
        this.indirizzo = t;
        this.picture = f;
    }
    public Evento(String n, String t, String d, Drawable f) {
        this.name = n;
        this.indirizzo = t;
        this.data=d;
        this.picture = f;
    }

    public String getName() {
        return name;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getData(){ return data; }

    public Drawable getPicture() {
        return picture;
    }
}



