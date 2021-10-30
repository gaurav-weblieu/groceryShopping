package com.grocery.shopping.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.grocery.shopping.Adapter.CatergoryAllListAdapter;
import com.grocery.shopping.Adapter.OurTipsAdapter;
import com.grocery.shopping.Adapter.ReviewAdapter;
import com.grocery.shopping.Adapter.SliderAdapterExample;
import com.grocery.shopping.Pojo.SliderItem;
import com.grocery.shopping.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class ProductDetaislActivity extends AppCompatActivity {

    RecyclerView recycleView_our_tips,recycleView_review,recycleView_similar_vender;
    private LinearLayout linear_layout;

    private SliderView sliderView;
    private SliderAdapterExample sliderAdapter;
    private ArrayList<Integer> arrayList_banner= new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detaisl);


        recycleView_our_tips=findViewById(R.id.recycleView_our_tips);
        recycleView_review=findViewById(R.id.recycleView_review);
        recycleView_similar_vender=findViewById(R.id.recycleView_similar_vender);
        linear_layout=findViewById(R.id.line1);

        sliderView = findViewById(R.id.imageSlider);

        arrayList_banner.add(R.drawable.imageone);
        arrayList_banner.add(R.drawable.imagetwo);
        arrayList_banner.add(R.drawable.imagethree);
        arrayList_banner.add(R.drawable.imagefour);


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




        sliderAdapter = new SliderAdapterExample(this);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(getResources().getColor(R.color.green_color));
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(6);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();


        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
            }
        });

        List<SliderItem> sliderItemList = new ArrayList<>();
        //dummy data

        for (int i = 0; i < arrayList_banner.size(); i++) {
            SliderItem sliderItem = new SliderItem();
            sliderItem.setImageUrl(arrayList_banner.get(i));
            sliderItemList.add(sliderItem);
        }

        sliderAdapter.renewItems(sliderItemList);

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
        Animation slide_down = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_down);
        linear_layout.startAnimation(slide_down);
        finish();
    }

    @Override
    public void onBackPressed(){
        Animation slide_down = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_down);
        linear_layout.startAnimation(slide_down);
        finish();
        super.onBackPressed();
    }

    public void call(View view) {
        Intent intentDial = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "123456789"));
        startActivity(intentDial);
    }

    private void setupWindowAnimations() {
        Slide slide = new Slide();
        slide.setDuration(1000);
        getWindow().setReturnTransition(slide);
    }


    public void add_to_cart(View view) {
       // startActivity(new Intent(this,Cart.class));
    }
}