package com.grocery.shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.grocery.shopping.Adapter.OurTipsAdapter;
import com.grocery.shopping.Adapter.VideoAdapter;
import com.grocery.shopping.R;

public class Albmus_Activity extends AppCompatActivity {

    RecyclerView recycleView_our_tips,recycleView_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albmus);

        recycleView_our_tips=findViewById(R.id.recycleView_our_tips);
        recycleView_video=findViewById(R.id.recycleView_video);

        OurTipsAdapter ourTipsAdapter = new OurTipsAdapter(this);
        recycleView_our_tips.setHasFixedSize(true);
        recycleView_our_tips.setLayoutManager(new GridLayoutManager(this,2));
        recycleView_our_tips.setAdapter(ourTipsAdapter);

        VideoAdapter videoAdapter = new VideoAdapter(this);
        recycleView_video.setHasFixedSize(true);
        recycleView_video.setLayoutManager(new GridLayoutManager(this,2));
        recycleView_video.setAdapter(videoAdapter);


    }

    public void finish(View view) {
        finish();
    }
}