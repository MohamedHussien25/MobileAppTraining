package com.mohamed.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button loginBtn = findViewById(R.id.loginBtn);
        EditText email = findViewById(R.id.emailFieldLogin);
        EditText pass = findViewById(R.id.passFieldLogin);

        SharedPreferences sharedPreferences = getSharedPreferences("User_Data", MODE_PRIVATE);

        String savedFName = sharedPreferences.getString("fname", "");
        String savedLName = sharedPreferences.getString("lname", "");
        String savedEmail = sharedPreferences.getString("email", "");
        String savedPass = sharedPreferences.getString("pass", "");


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emailData = email.getText().toString().trim();
                String passData = pass.getText().toString().trim();

                Log.d("LoginPage", "User "+savedFName+" "+savedLName+" Logged In");

                if(emailData.equals(savedEmail) && passData.equals(savedPass)){
                    Intent n = new Intent(Login.this, MainActivity.class);
                    startActivity(n);
                }
                else{
                    Log.d("LoginPage", "Login Failed");
                }



            }
        });


    }
}