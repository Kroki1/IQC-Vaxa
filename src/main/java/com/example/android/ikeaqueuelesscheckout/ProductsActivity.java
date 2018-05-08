package com.example.android.ikeaqueuelesscheckout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;

public class ProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products);


        // Find the View that shows the main category
        ImageView main = (ImageView) findViewById(R.id.mainScreen);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the main View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(ProductsActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });


        // Find the View that shows the main category
        ImageView shoppingList = (ImageView) findViewById(R.id.listScreen);

        // Set a click listener on that View
        shoppingList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the shopping list View is clicked on.
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(ProductsActivity.this, ShoppingListActivity.class);
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
                Intent settingsIntent = new Intent(ProductsActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });


        // Create a list of words
        ArrayList<String> IKEAproducts = new ArrayList<String>();

        //words.add("one");
        IKEAproducts.add("Summer");
        IKEAproducts.add("Baby & children products");
        IKEAproducts.add("Bathroom sinks, taps & cabinets");
        IKEAproducts.add("Beds");
        IKEAproducts.add("Chairs, stools & benches");
        IKEAproducts.add("Cookware");
        IKEAproducts.add("Decoration");
        IKEAproducts.add("Desks");
        IKEAproducts.add("Garden & outdoor decking");
        IKEAproducts.add("Food & beverages");
        IKEAproducts.add("Indoor gardening");
        IKEAproducts.add("Kitchen & worktops");
        IKEAproducts.add("Laundry & clening products");
        IKEAproducts.add("Leisure & safety products");
        IKEAproducts.add("Lighting");
        IKEAproducts.add("Mattresses");
        IKEAproducts.add("Parasols & gazebos");
        IKEAproducts.add("Small storage & organisers");
        IKEAproducts.add("Smart home & appliances");
        IKEAproducts.add("Sofas & armchairs");
        IKEAproducts.add("Storage furniture");
        IKEAproducts.add("Tables");
        IKEAproducts.add("Tableware");
        IKEAproducts.add("Textiles, curtains & rugs");
        IKEAproducts.add("Tools, fittings & curtain rails");
        IKEAproducts.add("Wireless charging");
        IKEAproducts.add("Wardrobes");
        IKEAproducts.add("Christmas");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, IKEAproducts);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}

