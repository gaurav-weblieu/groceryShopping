package com.grocery.Shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.grocery.Shopping.R;

public class ServiceProvider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_provider);
    }

    public void finish(View view) {
        finish();
    }

    public void reg_ven(View view) {
        startActivity(new Intent(this,FreeListBusiness.class));
    }
}