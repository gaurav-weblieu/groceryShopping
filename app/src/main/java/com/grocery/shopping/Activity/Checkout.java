package com.grocery.shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.grocery.shopping.R;

public class Checkout extends AppCompatActivity {

    RelativeLayout relative_to_payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        relative_to_payment=findViewById(R.id.relative_to_payment);

        relative_to_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Checkout.this,PaymentSelect.class));

            }
        });
    }

    public void finish(View view) {
        finish();
    }

    public void payment_selct(View view) {
    }
}