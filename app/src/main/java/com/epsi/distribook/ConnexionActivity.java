package com.epsi.distribook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ConnexionActivity extends AppCompatActivity {
    TextView insc;
    ImageButton home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        insc = findViewById(R.id.textView8);
        insc.setOnClickListener(v -> {

            Intent intent = new Intent(ConnexionActivity.this, InscriptionActivity.class);
            startActivity(intent);
        });

        home = findViewById(R.id.btnhome);
        home.setOnClickListener(v -> {

            Intent intent = new Intent(ConnexionActivity.this, MainActivity.class);
            startActivity(intent);
        });


    }


}