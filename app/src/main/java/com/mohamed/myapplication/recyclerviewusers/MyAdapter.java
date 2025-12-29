package com.mohamed.myapplication.recyclerviewusers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mohamed.myapplication.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

    Context context;
    List<UsersData> usersDataList;

    public MyAdapter(Context context, List<UsersData> usersDataList) {
        this.context = context;
        this.usersDataList = usersDataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_user_item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.fname.setText(usersDataList.get(position).getFname());
        holder.lname.setText(usersDataList.get(position).getLname());
        holder.email.setText(usersDataList.get(position).getEmail());
        holder.pass.setText(usersDataList.get(position).getPass());
    }

    @Override
    public int getItemCount() {
        return usersDataList.size();
    }
}
