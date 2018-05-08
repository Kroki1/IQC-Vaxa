package com.example.android.ikeaqueuelesscheckout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);


        // Find the View that shows the main category
        Button login = (Button) findViewById(R.id.loginButtSett);

        // Set a click listener on that View
        login.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the main View is clicked on.
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SettingsActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });

        // Find the View that shows the main category
        ImageView main = (ImageView) findViewById(R.id.mainScreen);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the main View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(SettingsActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

        // Find the View that shows the main category
        ImageView products = (ImageView) findViewById(R.id.productsScreen);

        // Set a click listener on that View
        products.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the products View is clicked on.
            @Override
            public void onClick(View view) {
                Intent productsIntent = new Intent(SettingsActivity.this, ProductsActivity.class);
                startActivity(productsIntent);
            }
        });

        // Find the View that shows the main category
        ImageView shoppingList = (ImageView) findViewById(R.id.listScreen);

        // Set a click listener on that View
        shoppingList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the shopping list View is clicked on.
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(SettingsActivity.this, ShoppingListActivity.class);
                startActivity(listIntent);
            }
        });


    }


}
