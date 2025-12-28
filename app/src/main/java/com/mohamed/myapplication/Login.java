package com.mohamed.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        NavBarFunctions navBarFunctions = new NavBarFunctions();
        LinearLayout navLogin = findViewById(R.id.navLogin);
        LinearLayout navHome = findViewById(R.id.navHome);
        LinearLayout navRegister = findViewById(R.id.navRegister);

        db = new DatabaseHelper(this);
        Button loginBtn = findViewById(R.id.loginBtn);
        EditText email = findViewById(R.id.emailFieldLogin);
        EditText pass = findViewById(R.id.passFieldLogin);




        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailData = email.getText().toString().trim();
                String passData = pass.getText().toString().trim();

                boolean loggedIn = db.checkUser(emailData, passData);

                if (loggedIn) {
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                    Intent n = new Intent(Login.this, MainActivity.class);
                    startActivity(n);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }


            }
        });

        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navBarFunctions.navHome(Login.this);
            }
        });

        navLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navBarFunctions.navLogin(Login.this);
            }
        });

        navRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navBarFunctions.navRegister(Login.this);
            }
        });


    }
}