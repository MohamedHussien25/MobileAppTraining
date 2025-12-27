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

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        Button regBtn = findViewById(R.id.regBtn);
        EditText fName = findViewById(R.id.fNameField);
        EditText lName = findViewById(R.id.lNameField);
        EditText email = findViewById(R.id.emailFieldReg);
        EditText pass = findViewById(R.id.passFieldReg);

        SharedPreferences sharedPreferences = getSharedPreferences("User_Data", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();






        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fnameData = fName.getText().toString().trim();
                String lnameData = lName.getText().toString().trim();
                String emailData = email.getText().toString().trim();
                String passData = pass.getText().toString().trim();

                editor.putString("fname", fnameData);
                editor.putString("lname", lnameData);
                editor.putString("email", emailData);
                editor.putString("pass", passData);
                editor.apply();

                Log.d("RegisterPage", "User Data\n"+fnameData+"\n"+lnameData+"\n"+emailData+"\n"+passData+" Registered");

                Intent n = new Intent(Register.this, Login.class);
                startActivity(n);


            }
        });
    }
}