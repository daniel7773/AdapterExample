package com.example.adapterexample;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    MyAdapter adapter = new MyAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList myList = new ArrayList();

        myList.add("Один");
        myList.add("Вилли");
        myList.add("Ве");
        myList.add("Хеймльдар");

        RecyclerView recyclerView = new RecyclerView(this);
        recyclerView.setAdapter(adapter);
        adapter.updateItems(myList);

    }



}
