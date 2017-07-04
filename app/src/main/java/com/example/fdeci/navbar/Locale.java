package com.example.fdeci.navbar;

/**
 * Created by Martina on 23/06/2017.
 */

import android.graphics.drawable.Drawable;


public class Locale {
    private String name;
    private String indirizzo;
    private Drawable picture;

    public Locale(String n, String t, Drawable f) {
        this.name = n;
        this.indirizzo = t;
        this.picture = f;
    }

    public String getName() {
        return name;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public Drawable getPicture() {
        return picture;
    }
}
