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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageButton account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        account = findViewById(R.id.logo_account);
        account.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, ConnexionActivity.class);
            startActivity(intent);
        });



        }


    }