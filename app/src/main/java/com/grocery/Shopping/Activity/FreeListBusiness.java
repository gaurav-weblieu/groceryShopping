package com.grocery.Shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.grocery.Shopping.R;

public class FreeListBusiness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_list_business);
    }

    public void finish(View view) {
        finish();
    }
}