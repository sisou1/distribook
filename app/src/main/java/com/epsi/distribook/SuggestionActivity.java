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

public class SuggestionActivity extends AppCompatActivity {
    ImageButton account,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);

        account = findViewById(R.id.logo_account);
        account.setOnClickListener(v -> {

            Intent intent = new Intent(SuggestionActivity.this, ConnexionActivity.class);
            startActivity(intent);
        });

        home = findViewById(R.id.btnhome);
        home.setOnClickListener(v -> {

            Intent intent = new Intent(SuggestionActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }


}