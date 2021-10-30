package com.grocery.shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.grocery.shopping.Adapter.CartAdapter;
import com.grocery.shopping.R;

public class Cart extends AppCompatActivity {

    RecyclerView recycleView_cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        recycleView_cart=findViewById(R.id.recycleView_cart);
        recycleView_cart.setHasFixedSize(true);
        recycleView_cart.setLayoutManager(new LinearLayoutManager(this));
        CartAdapter cartAdapter = new CartAdapter(this);
        recycleView_cart.setAdapter(cartAdapter);

    }


    public void finish(View view) {
        finish();
    }

    public void check_out(View view) {
        startActivity(new Intent(this, Checkout.class));
    }
}