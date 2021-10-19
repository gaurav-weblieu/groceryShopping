package com.eweding.eweds.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.eweding.eweds.Adapter.OurTipsAdapter;
import com.eweding.eweds.R;

public class Albmus_Activity extends AppCompatActivity {

    RecyclerView recycleView_our_tips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albmus);

        recycleView_our_tips=findViewById(R.id.recycleView_our_tips);

        OurTipsAdapter ourTipsAdapter = new OurTipsAdapter(this);
        recycleView_our_tips.setHasFixedSize(true);
        recycleView_our_tips.setLayoutManager(new GridLayoutManager(this,2));
        recycleView_our_tips.setAdapter(ourTipsAdapter);
    }

    public void finish(View view) {
        finish();
    }
}