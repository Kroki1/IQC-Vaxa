package com.example.android.ikeaqueuelesscheckout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.*;

public class LoginActivity extends AppCompatActivity {

    String correctPassword = "ikea123";
    String correctEMail = "noqueue@ikea.com";
    String msg = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
    }

    public void checkLogin(View view) {

        // Check if no view has focus:
        view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

        msg = "";
        emailPasswordTest();


    }

    public String emailPasswordTest () {

        TextInputLayout inputEmail = (TextInputLayout) findViewById(R.id.email);
        String email = inputEmail.getEditText().getText().toString();
        email = email.toLowerCase();

        TextInputLayout inputPassword = (TextInputLayout) findViewById(R.id.password);
        String password = inputPassword.getEditText().getText().toString();


        if (email.equals(correctEMail) && password.equals(correctPassword)) {

            Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(mainIntent);

            Context context = getApplicationContext();
            CharSequence text = "Welcome back noQueue";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

//            // hide login section in settings
//            LinearLayout loginView = (LinearLayout) findViewById(R.id.loginSettings);
//            loginView.setVisibility(View.GONE);

            //change picture on the main page
            //To do - add code to change picture on the main page

        } else {
            msg = "Incorrect e-mail address or password";

            Context context = getApplicationContext();
            //CharSequence text = msg;
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, msg, duration);
            toast.show();

        }

        return msg;
    }


}

