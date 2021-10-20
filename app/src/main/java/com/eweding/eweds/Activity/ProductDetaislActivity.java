package com.eweding.eweds.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.eweding.eweds.Adapter.CatergoryAllListAdapter;
import com.eweding.eweds.Adapter.OurTipsAdapter;
import com.eweding.eweds.Adapter.ReviewAdapter;
import com.eweding.eweds.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class ProductDetaislActivity extends AppCompatActivity {

    RecyclerView recycleView_our_tips,recycleView_review,recycleView_similar_vender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detaisl);

        recycleView_our_tips=findViewById(R.id.recycleView_our_tips);
        recycleView_review=findViewById(R.id.recycleView_review);
        recycleView_similar_vender=findViewById(R.id.recycleView_similar_vender);


        OurTipsAdapter ourTipsAdapter = new OurTipsAdapter(this);
        recycleView_our_tips.setHasFixedSize(true);
        recycleView_our_tips.setLayoutManager(new GridLayoutManager(this,2));
        recycleView_our_tips.setAdapter(ourTipsAdapter);

        ReviewAdapter reviewAdapter = new ReviewAdapter(this);
        recycleView_review.setHasFixedSize(true);
        recycleView_review.setLayoutManager(new LinearLayoutManager(this));
        recycleView_review.setAdapter(reviewAdapter);

        CatergoryAllListAdapter adapter = new CatergoryAllListAdapter(this);
        recycleView_similar_vender.setHasFixedSize(true);
        recycleView_similar_vender.setLayoutManager(new LinearLayoutManager(this));
        recycleView_similar_vender.setAdapter(adapter);

    }

    public void send(View view) {
        startActivity(new Intent(this,SendMessage.class));
    }

    public void see_all_elbum(View view) {
        startActivity(new Intent(this,Albmus_Activity.class));

    }


    private void showBottomSheetDialog() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.price_info_bottom_view);


        bottomSheetDialog.show();
    }

    public void see_price(View view) {
        showBottomSheetDialog();
    }

    public void finish(View view) {
        finish();
    }

    public void call(View view) {
        Intent intentDial = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "123456789"));
        startActivity(intentDial);
    }
}