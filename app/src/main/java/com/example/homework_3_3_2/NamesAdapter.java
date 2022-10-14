package com.example.homework_3_3_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NamesAdapter extends RecyclerView.Adapter<MonthsViewHolder>{
    private ArrayList<String> monthsList;

    public NamesAdapter(ArrayList<String> monthsList) {
        this.monthsList = monthsList;
    }

    @NonNull
    @Override
    public MonthsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MonthsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_months,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MonthsViewHolder holder, int position) {
holder.bind(monthsList.get(position));
    }

    @Override
    public int getItemCount() {
        return monthsList.size();
    }
}

