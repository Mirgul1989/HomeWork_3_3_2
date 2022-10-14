package com.example.homework_3_3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MonthsViewHolder extends RecyclerView.ViewHolder {
    private TextView tvMonths;
    public MonthsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMonths=itemView.findViewById(R.id.tvMonths);
    }
    public void bind (String colors){
        tvMonths.setText(colors);
    }
}
