package com.mohamed.myapplication.recyclerviewusers;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mohamed.myapplication.DatabaseHelper;
import com.mohamed.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ViewUsers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view_users);

            DatabaseHelper db = new DatabaseHelper(ViewUsers.this);
            List<UsersData> usersDataList = db.getAllUsersList();
            RecyclerView recyclerView = findViewById(R.id.users_recycler_view);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }






}