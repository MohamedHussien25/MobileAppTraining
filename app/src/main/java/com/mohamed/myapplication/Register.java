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

public class Register extends AppCompatActivity {
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        db = new DatabaseHelper(this);

        NavBarFunctions navBarFunctions = new NavBarFunctions();
        LinearLayout navLogin = findViewById(R.id.navLogin);
        LinearLayout navHome = findViewById(R.id.navHome);
        LinearLayout navRegister = findViewById(R.id.navRegister);

        Button regBtn = findViewById(R.id.regBtn);
        EditText fName = findViewById(R.id.fNameField);
        EditText lName = findViewById(R.id.lNameField);
        EditText email = findViewById(R.id.emailFieldReg);
        EditText pass = findViewById(R.id.passFieldReg);



        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fNameData = fName.getText().toString().trim();
                String lNameData = lName.getText().toString().trim();
                String emailData = email.getText().toString().trim();
                String passData = pass.getText().toString().trim();


                boolean inserted = db.insertUser(fNameData, lNameData, emailData, passData);

                if (inserted) {
                    Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_SHORT).show();
                    Intent n = new Intent(Register.this, Login.class);
                    startActivity(n);
                } else {
                    Toast.makeText(getApplicationContext(), "Registration Failed", Toast.LENGTH_SHORT).show();
                }


            }
        });

        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navBarFunctions.navHome(Register.this);
            }
        });

        navLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navBarFunctions.navLogin(Register.this);
            }
        });

        navRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navBarFunctions.navRegister(Register.this);
            }
        });
    }

}