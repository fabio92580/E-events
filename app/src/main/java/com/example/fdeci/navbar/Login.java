package com.example.fdeci.navbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by fdeci on 30/05/2017.
 */

public class Login extends Activity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }


    public void login(View v){
        Intent openPage1= new Intent(Login.this, HomeUtenteNonRegistrato.class);
        startActivity(openPage1);
    }
}
