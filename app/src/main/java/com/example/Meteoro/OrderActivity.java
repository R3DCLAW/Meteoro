package com.example.Meteoro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.Meteoro.Adapters.OrdersAdapter;
import com.example.Meteoro.Models.OrdersModel;
import com.example.Meteoro.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.brownie1 , "Brownie" , "200" , "1572486"));
        list.add(new OrdersModel(R.drawable.cookie1 , "Galleta" , "100" , "7548962"));
        list.add(new OrdersModel(R.drawable.minibrownie1 , "Mini Brownie" , "150" , "5423685"));
        list.add(new OrdersModel(R.drawable.pie1 , "Pie" , "300" , "6348217"));
        list.add(new OrdersModel(R.drawable.pieind , "Pie por porciones" , "100" , "7518628"));

        OrdersAdapter adapter = new OrdersAdapter(list , this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);
    }
}