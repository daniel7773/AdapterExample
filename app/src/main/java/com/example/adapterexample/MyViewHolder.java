package com.example.adapterexample;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    TextView description;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.post_source_name);
        description = itemView.findViewById(R.id.post_date);
    }

    public void onBind(String s) {
        title.setText(s);
        description.setText(s.hashCode() + "");
    }
}
