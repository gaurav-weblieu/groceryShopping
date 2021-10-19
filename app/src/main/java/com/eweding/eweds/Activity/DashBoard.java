package com.eweding.eweds.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.eweding.eweds.Adapter.CatergoryAdapter;
import com.eweding.eweds.Adapter.OurTipsAdapter;
import com.eweding.eweds.Adapter.PopularListAdapter;
import com.eweding.eweds.Adapter.WeddingPlanAdapter;
import com.eweding.eweds.Fragment.BlogFragment;
import com.eweding.eweds.Fragment.HomeFragment;
import com.eweding.eweds.Fragment.WeddingPlaning;
import com.eweding.eweds.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class DashBoard extends AppCompatActivity {

    BottomNavigationView bottomNavigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

         bottomNavigation=findViewById(R.id.bottomNavigation);

        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.vender:
                        openFragment(new HomeFragment());
                        return true;
                    case R.id.plan:
                        openFragment(new WeddingPlaning());
                        return true;
                    case R.id.dress_plan:
                        openFragment(new WeddingPlaning());
                        return true;

                    case R.id.dress_song:
                        openFragment(new WeddingPlaning());
                        return true;

                    case R.id.dress_blog:
                        openFragment(new BlogFragment());
                        return true;
                }
                return false;
            }

        });

        openFragment(new HomeFragment());


    }


    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
       // transaction.addToBackStack(null);
        transaction.commit();
    }



}