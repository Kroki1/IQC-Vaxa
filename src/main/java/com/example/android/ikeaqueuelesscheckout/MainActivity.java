package com.example.android.ikeaqueuelesscheckout;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the main category
        ImageView loginMain = (ImageView) findViewById(R.id.login);

        // Login sent from main page
        String clickedOnMainPage = "";

        // Set a click listener on that View
        loginMain.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the main View is clicked on.
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });

        // Find the View that shows the main category
        ImageView products = (ImageView) findViewById(R.id.productsScreen);

        // Set a click listener on that View
        products.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the products View is clicked on.
            @Override
            public void onClick(View view) {
                Intent productsIntent = new Intent(MainActivity.this, ProductsActivity.class);
                startActivity(productsIntent);
            }
        });

        // Find the View that shows the main category
        ImageView shoppingList = (ImageView) findViewById(R.id.listScreen);

        // Set a click listener on that View
        shoppingList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the shopping list View is clicked on.
            @Override
            public void onClick(View v) {
                Intent listIntent = new Intent(MainActivity.this, ShoppingListActivity.class);
                startActivity(listIntent);
            }
        });

        // Find the View that shows the main category
        ImageView sett = (ImageView) findViewById(R.id.settingsScreen);

        // Set a click listener on that View
        sett.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the products View is clicked on.
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });

    }

    public void scanCode(View view) {

        // Find the View that shows the main category
        ImageView scanButt = (ImageView) findViewById(R.id.scan);

        dispatchTakePictureIntent();

    }

    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }



}
