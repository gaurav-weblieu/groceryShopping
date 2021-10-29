package com.grocery.Shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.grocery.Shopping.Adapter.ShortListAdapter;
import com.grocery.Shopping.R;

public class ShortList extends AppCompatActivity {

    RecyclerView recycleView_short;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_list);
        recycleView_short=findViewById(R.id.recycleView_short);

        ShortListAdapter adapter = new ShortListAdapter(this);
        recycleView_short.setHasFixedSize(true);
        recycleView_short.setLayoutManager(new GridLayoutManager(this,2));
        recycleView_short.setAdapter(adapter);


    }

    public void finish(View view) {
        finish();
    }
}