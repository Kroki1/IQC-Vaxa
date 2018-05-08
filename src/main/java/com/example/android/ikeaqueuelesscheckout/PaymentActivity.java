package com.example.android.ikeaqueuelesscheckout;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_page);


        Intent payIntent = getIntent();
        Bundle bundle = payIntent.getExtras();
        String doZaplaty = bundle.getString("cenaTotal");
        Boolean prod11 = bundle.getBoolean("prod1");
        Boolean prod22 = bundle.getBoolean("prod2");
        Boolean prod33 = bundle.getBoolean("prod3");

        ImageView prodWyswietl1 = (ImageView) findViewById(R.id.produkt11);
        ImageView prodWyswiet22 = (ImageView) findViewById(R.id.produkt22);
        ImageView prodWyswiet33 = (ImageView) findViewById(R.id.produkt33);

        if (prod11==false) {
            prodWyswietl1.setVisibility(View.GONE);
        }
        if (prod22==false) {
            prodWyswiet22.setVisibility(View.GONE);
        }
        if (prod33==false) {
            prodWyswiet33.setVisibility(View.GONE);
        }

        TextView cenaDoZaplaty = (TextView) findViewById(R.id.cena);
        cenaDoZaplaty.setText(doZaplaty);



        // Find the View that shows the main category
        ImageView main = (ImageView) findViewById(R.id.mainScreen);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the main View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(PaymentActivity.this, MainActivity.class);
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
                Intent productsIntent = new Intent(PaymentActivity.this, ProductsActivity.class);
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
                Intent listIntent = new Intent(PaymentActivity.this, ShoppingListActivity.class);
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
                Intent settingsIntent = new Intent(PaymentActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });

        // Find the View that shows the main category
        ImageView payButtonClick = (ImageView) findViewById(R.id.payButton);

        // Set a click listener on that View
        payButtonClick.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the shopping list View is clicked on.
            @Override
            public void onClick(View view) {
                LinearLayout hideProducts = (LinearLayout) findViewById(R.id.productsLayout);
                hideProducts.setVisibility(view.GONE);
                LinearLayout showSuccess = (LinearLayout) findViewById(R.id.paymentDone);
                showSuccess.setVisibility(view.VISIBLE);
            }
        });

        // Find the View that shows the main category
        Button downloadReceipt = (Button) findViewById(R.id.downloadReceipt);
        // Set a click listener on that View
        downloadReceipt.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the shopping list View is clicked on.
            @Override
            public void onClick(View view) {
                LinearLayout hideProducts = (LinearLayout) findViewById(R.id.productsLayout);
                hideProducts.setVisibility(view.GONE);
                LinearLayout showSuccess = (LinearLayout) findViewById(R.id.paymentDone);
                showSuccess.setVisibility(view.GONE);
                LinearLayout receipt = (LinearLayout) findViewById(R.id.receipt);
                receipt.setVisibility(view.VISIBLE);

            }
        });


    }


}