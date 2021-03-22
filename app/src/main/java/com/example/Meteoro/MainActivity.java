package com.example.Meteoro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.Meteoro.Adapters.MainAdapter;
import com.example.Meteoro.Models.MainModel;
import com.example.Meteoro.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.brownie1 , "Brownie" , "200" , "Delicioso brownie"));
        list.add(new MainModel(R.drawable.cookie1 , "Galleta" , "100" , "Sabrosas galletas con chispas de chocolate"));
        list.add(new MainModel(R.drawable.minibrownie1 , "Mini Brownie" , "150" , "Todo el sabor de un brownie en un empaque pequeño"));
        list.add(new MainModel(R.drawable.pie1 , "Pie" , "300" , "Nuestro famoso pie"));
        list.add(new MainModel(R.drawable.pieind , "Pie por porciones" , "100" , "Porciones de nuestro delicioso pie"));

        MainAdapter adapter = new MainAdapter(list , this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }
}