package com.mohamed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        NavBarFunctions navBarFunctions = new NavBarFunctions();
        LinearLayout navLogin = findViewById(R.id.navLogin);
        LinearLayout navHome = findViewById(R.id.navHome);
        LinearLayout navRegister = findViewById(R.id.navRegister);



        Button regBtn = findViewById(R.id.regBtnHome);
        Button loginBtn = findViewById(R.id.loginBtnHome);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent n = new Intent(MainActivity.this, Register.class);
                startActivity(n);
            }
        });
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(MainActivity.this, Login.class);
                startActivity(n);

            }
        });

        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navBarFunctions.navHome(MainActivity.this);
            }
        });

        navLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navBarFunctions.navLogin(MainActivity.this);
            }
        });

        navRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navBarFunctions.navRegister(MainActivity.this);
            }
        });


    }
}