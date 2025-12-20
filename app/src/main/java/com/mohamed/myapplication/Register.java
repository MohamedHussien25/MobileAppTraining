package com.mohamed.myapplication;

import android.content.Intent;
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





        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String message = "Registration Successful\n" + "Full Name: " + fName.getText().toString() + " " + lName.getText().toString() + "\n" +
                        "Email: " + email.getText().toString() + "\n" +"Password: "+ pass.getText().toString();
                Log.d("MyApp", message);
                Intent n = new Intent(Register.this, Login.class);
                startActivity(n);

            }
        });
    }
}