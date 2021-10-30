package com.grocery.shopping.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.grocery.shopping.Fragment.BlogFragment;
import com.grocery.shopping.Fragment.HomeFragment;
import com.grocery.shopping.Fragment.WeddingPlaning;
import com.grocery.shopping.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class DashBoard extends AppCompatActivity {

    BottomNavigationView bottomNavigation;
    public DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

         bottomNavigation=findViewById(R.id.bottomNavigation);



        Toolbar toolbar = findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);

        drawerLayout =findViewById(R.id.my_drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_main);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

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

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.vendor_login:
                        startActivity(new Intent(DashBoard.this, ServiceProvider.class));
                        break;

                    case R.id.free_business:
                        startActivity(new Intent(DashBoard.this, FreeListBusiness.class));

                        break;

                    case R.id.user_login:
                        startActivity(new Intent(DashBoard.this, LoginActivity.class));

                        break;
                }
                return true;
            }
        });

    }

    public void cart(View view) {
        startActivity(new Intent(this,Cart.class));
    }


    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
       // transaction.addToBackStack(null);
        transaction.commit();
    }


    public void city(View view) {
        startActivity(new Intent(DashBoard.this,City_Select.class));
    }
}