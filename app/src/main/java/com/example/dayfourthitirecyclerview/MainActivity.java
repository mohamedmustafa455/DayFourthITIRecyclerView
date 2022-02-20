package com.example.dayfourthitirecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    CustomAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.RV);

        List<Model> contact=new ArrayList<>();
        contact.add(new Model("Mohamed","01013425868", R.drawable.avatar));
        contact.add(new Model("Mohamed","01013425868", R.drawable.ic_baseline_engineering));
        contact.add(new Model("Mohamed","01013425868", R.drawable.avatar));
        contact.add(new Model("Mohamed","01013425868", R.drawable.ic_baseline_engineering));
        contact.add(new Model("Mohamed","01013425868", R.drawable.avatar));
        contact.add(new Model("Mohamed","01013425868", R.drawable.ic_baseline_engineering));
        contact.add(new Model("Mohamed","01013425868", R.drawable.avatar));
        contact.add(new Model("Mohamed","01013425868", R.drawable.ic_baseline_engineering));
        contact.add(new Model("Mohamed","01013425868", R.drawable.avatar));
        contact.add(new Model("Mohamed","01013425868", R.drawable.ic_baseline_engineering));
        contact.add(new Model("Mohamed","01013425868", R.drawable.avatar));
        contact.add(new Model("Mohamed","01013425868", R.drawable.ic_baseline_engineering));
        contact.add(new Model("Mohamed","01013425868", R.drawable.avatar));
        contact.add(new Model("Mohamed","01013425868", R.drawable.ic_baseline_engineering));




        adapter=new CustomAdapter(contact);
        recyclerView.setAdapter(adapter);





    }
}