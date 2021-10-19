package com.eweding.eweds.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.eweding.eweds.Adapter.CatergoryAdapter;
import com.eweding.eweds.Adapter.CatergoryAllListAdapter;
import com.eweding.eweds.R;

public class CatergoryFullListActivity extends AppCompatActivity {

    RecyclerView recycleView_category_all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catergory_full_list);

        recycleView_category_all=findViewById(R.id.recycleView_category_all);

        CatergoryAllListAdapter adapter = new CatergoryAllListAdapter(this);
        recycleView_category_all.setHasFixedSize(true);
        recycleView_category_all.setLayoutManager(new LinearLayoutManager(this));
        recycleView_category_all.setAdapter(adapter);

    }

    public void finish(View view) {
        finish();
    }

    public void short_list(View view) {
        startActivity(new Intent(this,ShortList.class));
    }
}