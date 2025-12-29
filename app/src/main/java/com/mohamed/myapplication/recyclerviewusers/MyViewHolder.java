package com.mohamed.myapplication.recyclerviewusers;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mohamed.myapplication.R;

public class MyViewHolder extends RecyclerView.ViewHolder{

    TextView fname;
    TextView lname;
    TextView email;
    TextView pass;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        fname = itemView.findViewById(R.id.user_fname);
        lname = itemView.findViewById(R.id.user_lname);
        email = itemView.findViewById(R.id.user_email);
        pass = itemView.findViewById(R.id.user_pass);
    }

}
