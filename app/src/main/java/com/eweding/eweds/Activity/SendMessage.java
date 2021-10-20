package com.eweding.eweds.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.eweding.eweds.R;

public class SendMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
    }

    public void finish(View view) {
        finish();
    }

    public void send_mesage(View view) {
        startActivity(new Intent(this,LoginActivity.class));
    }
}