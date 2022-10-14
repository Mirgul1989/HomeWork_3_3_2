package com.example.homework_3_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMonths;
    private ArrayList<String> monthsList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMonths=findViewById(R.id.rv_months);
        monthsList.add("Январь");
        monthsList.add("Февраль");
        monthsList.add("Март");
        monthsList.add("Апрель");
        monthsList.add("Май");
        monthsList.add("Июнь");
        monthsList.add("Июль");
        monthsList.add("Август");
        monthsList.add("Сентябрь");
        monthsList.add("Октябрь");
        monthsList.add("Ноябрь");
        monthsList.add("Декабрь");


        NamesAdapter namesAdapter=new NamesAdapter(monthsList);
        rvMonths.setAdapter(namesAdapter);
    }
}

