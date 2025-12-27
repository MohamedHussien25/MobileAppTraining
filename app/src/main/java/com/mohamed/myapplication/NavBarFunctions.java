package com.mohamed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class NavBarFunctions {
    public void navHome(Context context) {

        if (context instanceof MainActivity) {
            Toast.makeText(context, "You are in Home", Toast.LENGTH_SHORT).show();
        } else {
            context.startActivity(
                    new Intent(context, MainActivity.class)
            );
        }


    }

    public void navLogin(Context context) {

        if (context instanceof Login) {
            Toast.makeText(context, "You are in Login", Toast.LENGTH_SHORT).show();
        } else {
            context.startActivity(
                    new Intent(context, Login.class)
            );
        }


    }

    public void navRegister(Context context) {

        if (context instanceof Register) {
            Toast.makeText(context, "You are in Register", Toast.LENGTH_SHORT).show();
        } else {
            context.startActivity(
                    new Intent(context, Register.class)
            );
        }


    }
}
