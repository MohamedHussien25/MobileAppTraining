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

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button loginBtn = findViewById(R.id.loginBtn);
        EditText email = findViewById(R.id.emailFieldLogin);
        EditText pass = findViewById(R.id.passFieldLogin);




        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "Login Successful\n" + "Email: " + email.getText().toString() + "\n" +"Password: "+ pass.getText().toString();
                Log.d("MyApp", message);
                Intent n = new Intent(Login.this, MainActivity.class);
                startActivity(n);

            }
        });

    }
}