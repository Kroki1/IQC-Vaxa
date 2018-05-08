package com.example.android.ikeaqueuelesscheckout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ShoppingListActivity extends AppCompatActivity {

    boolean item11 = false;
    double item1Price = 1.75;
    boolean item22 = false;
    double item2Price = 45;
    boolean item33 = false;
    double item3Price = 7;
    boolean anyCollected = false;
    TextView priceView;
    double totalPrice = 0.00;

    ImageView item1LongClick;
    ImageView item2LongClick;
    ImageView item3LongClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_list);


        // Find the View that shows the main category
        ImageView main = (ImageView) findViewById(R.id.mainScreen);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the main View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(ShoppingListActivity.this, MainActivity.class);
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
                Intent productsIntent = new Intent(ShoppingListActivity.this, ProductsActivity.class);
                startActivity(productsIntent);
            }
        });


        // Find the View that shows the main category
        ImageView sett = (ImageView) findViewById(R.id.settingsScreen);

        // Set a click listener on that View
        sett.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the products View is clicked on.
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(ShoppingListActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });

        priceView = (TextView) findViewById(R.id.price);

        //item1
        final ImageView item1LongClick = (ImageView) findViewById(R.id.item1);
        item1LongClick.setOnLongClickListener(new OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                if (item11 == false) {
                    item1LongClick.setImageDrawable(getDrawable(R.drawable.item1collected));
                    item11 = true;
                    totalPrice = totalPrice + item1Price;
                    priceView.setText("£"+totalPrice); //leave this line to assign a specific text

                    Toast.makeText(getApplicationContext(),
                            "Product collected", Toast.LENGTH_SHORT).show();

                }else {
                    item1LongClick.setImageDrawable(getDrawable(R.drawable.item1));
                    item11 = false;
                    totalPrice = totalPrice - item1Price;
                    priceView.setText("£"+totalPrice); //leave this line to assign a specific text

                    Toast.makeText(getApplicationContext(),
                            "Product removed from basket", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        //end of product code

        //item2
        final ImageView item2LongClick = (ImageView) findViewById(R.id.item2);
        item2LongClick.setOnLongClickListener(new OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                if (item22 == false) {
                    item2LongClick.setImageDrawable(getDrawable(R.drawable.item2collected));
                    item22 = true;
                    totalPrice = totalPrice + item2Price;
                    priceView.setText("£"+totalPrice); //leave this line to assign a specific text

                    Toast.makeText(getApplicationContext(),
                            "Product collected", Toast.LENGTH_SHORT).show();

                }else {
                    item2LongClick.setImageDrawable(getDrawable(R.drawable.item2));
                    item22 = false;
                    totalPrice = totalPrice - item2Price;
                    priceView.setText("£"+totalPrice); //leave this line to assign a specific text

                    Toast.makeText(getApplicationContext(),
                            "Product removed from basket", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        //end of product code

        //item3
        final ImageView item3LongClick = (ImageView) findViewById(R.id.item3);
        item3LongClick.setOnLongClickListener(new OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub

                if (item33 == false) {
                    item3LongClick.setImageDrawable(getDrawable(R.drawable.item3collected));
                    item33 = true;
                    totalPrice = totalPrice + item3Price;
                    priceView.setText("£"+totalPrice); //leave this line to assign a specific text

                    Toast.makeText(getApplicationContext(),
                            "Product collected", Toast.LENGTH_SHORT).show();

                }else {
                    item3LongClick.setImageDrawable(getDrawable(R.drawable.item3));
                    item33 = false;
                    totalPrice = totalPrice - item3Price;
                    priceView.setText("£"+totalPrice); //leave this line to assign a specific text

                    Toast.makeText(getApplicationContext(),
                            "Product removed from basket", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        //end of product code


        Button clearListButton = (Button) findViewById(R.id.clearList);
        clearListButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the products View is clicked on.
            @Override
            public void onClick(View view) {

                item1LongClick.setImageDrawable(getDrawable(R.drawable.item1));
                item2LongClick.setImageDrawable(getDrawable(R.drawable.item2));
                item3LongClick.setImageDrawable(getDrawable(R.drawable.item3));

                totalPrice = 0.00;
                priceView.setText("£"+totalPrice+"0"); //leave this line to assign a specific text
            }
        });

        final Button payButton = (Button) findViewById(R.id.payButton);
        payButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the products View is clicked on.
            @Override
            public void onClick(View view) {

//                item1LongClick.setImageDrawable(getDrawable(R.drawable.item1));
//                item2LongClick.setImageDrawable(getDrawable(R.drawable.item2));
//                item3LongClick.setImageDrawable(getDrawable(R.drawable.item3));

                String strTotalPrice = "£"+ String.valueOf(totalPrice);

                Intent payIntent = new Intent(ShoppingListActivity.this, PaymentActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("cenaTotal",strTotalPrice);
                bundle.putBoolean("prod1",item11);
                bundle.putBoolean("prod2",item22);
                bundle.putBoolean("prod3",item33);
                payIntent.putExtras(bundle);
                startActivity(payIntent);

            }
        });

    }


    public void itemCollected(View view) {

        //get view ID
        String viewID = view.getResources().getResourceEntryName(view.getId());

        Context context = getApplicationContext();
        CharSequence text = "Click long to collect the product";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

}






