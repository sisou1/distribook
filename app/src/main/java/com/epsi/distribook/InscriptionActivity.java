package com.epsi.distribook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class InscriptionActivity extends AppCompatActivity {
    ImageButton account, home;
    ImageButton menuButton;
    private static final int MENU_ITEM_1 = R.id.item1;
    private static final int MENU_ITEM_2 = R.id.item2;
    private static final int MENU_ITEM_3 = R.id.item3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        account = findViewById(R.id.logo_account);
        account.setOnClickListener(v -> {

            Intent intent = new Intent(InscriptionActivity.this, ConnexionActivity.class);
            startActivity(intent);
        });

        home = findViewById(R.id.btnhome);
        home.setOnClickListener(v -> {

            Intent intent = new Intent(InscriptionActivity.this, MainActivity.class);
            startActivity(intent);
        });

        menuButton = findViewById(R.id.menu_btn);
        PopupMenu popupMenu = new PopupMenu(this, menuButton);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.menu_main, popupMenu.getMenu());

        menuButton.setOnClickListener(v -> {
            popupMenu.show();


            popupMenu.setOnMenuItemClickListener(item -> {
                int itemId=item.getItemId();
                if (itemId == MENU_ITEM_1) {
                    Intent intent = new Intent(InscriptionActivity.this, SuggestionActivity.class);
                    startActivity(intent);
                    return true;
                } else if (itemId == MENU_ITEM_2) {
                    Intent intent = new Intent(InscriptionActivity.this, DistributeurActivity.class);
                    startActivity(intent);
                    return true;
                }
                else if (itemId == MENU_ITEM_3) {
                    Intent intent = new Intent(InscriptionActivity.this, TarifActivity.class);
                    startActivity(intent);
                    return true;
                }else {
                    return false;
                }
            });
        });

    }


}