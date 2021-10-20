package com.eweding.eweds.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.eweding.eweds.Activity.City_Select;
import com.eweding.eweds.Activity.FreeListBusiness;
import com.eweding.eweds.Activity.LoginActivity;
import com.eweding.eweds.Activity.ServiceProvider;
import com.eweding.eweds.Activity.Vender_Category;
import com.eweding.eweds.Adapter.CatergoryAdapter;
import com.eweding.eweds.Adapter.OurTipsAdapter;
import com.eweding.eweds.Adapter.PopularListAdapter;
import com.eweding.eweds.Adapter.WeddingPlanAdapter;
import com.eweding.eweds.R;


public class HomeFragment extends Fragment {

    RecyclerView recycleView_category,recycleView_pre_wedding,recycleView_vender_bride,recycleView_vender_groom,
            recycleView_popular_features,recycleView_our_tips;

    LinearLayout line_van,line_city;
    CardView cardView_profile,cardView_service,cardView_business_list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);


        recycleView_category=view.findViewById(R.id.recycleView_category);
        recycleView_pre_wedding=view.findViewById(R.id.recycleView_pre_wedding);
        recycleView_vender_bride=view.findViewById(R.id.recycleView_vender_bride);
        recycleView_vender_groom=view.findViewById(R.id.recycleView_vender_groom);
        recycleView_popular_features=view.findViewById(R.id.recycleView_popular_features);
        recycleView_our_tips=view.findViewById(R.id.recycleView_our_tips);
        line_van=view.findViewById(R.id.line_van);
        line_city=view.findViewById(R.id.line_city);
        cardView_profile=view.findViewById(R.id.cardView_profile);
        cardView_service=view.findViewById(R.id.cardView_service);
        cardView_business_list=view.findViewById(R.id.cardView_business_list);

        CatergoryAdapter adapter = new CatergoryAdapter(getActivity());
        recycleView_category.setHasFixedSize(true);
        recycleView_category.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recycleView_category.setAdapter(adapter);

        recycleView_vender_bride.setHasFixedSize(true);
        recycleView_vender_bride.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recycleView_vender_bride.setAdapter(adapter);

        recycleView_vender_groom.setHasFixedSize(true);
        recycleView_vender_groom.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recycleView_vender_groom.setAdapter(adapter);

        WeddingPlanAdapter adapter1 = new WeddingPlanAdapter(getActivity());
        recycleView_pre_wedding.setHasFixedSize(true);
        recycleView_pre_wedding.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recycleView_pre_wedding.setAdapter(adapter1);

        PopularListAdapter popularListAdapter = new PopularListAdapter(getActivity());
        recycleView_popular_features.setHasFixedSize(true);
        recycleView_popular_features.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recycleView_popular_features.setAdapter(popularListAdapter);


        OurTipsAdapter ourTipsAdapter = new OurTipsAdapter(getActivity());
        recycleView_our_tips.setHasFixedSize(true);
        recycleView_our_tips.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recycleView_our_tips.setAdapter(ourTipsAdapter);


        line_van.setOnClickListener(v -> startActivity(new Intent(getActivity(), Vender_Category.class)));

        line_city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), City_Select.class));

            }
        });

        cardView_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LoginActivity.class));

            }
        });

        cardView_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ServiceProvider.class));

            }
        });

        cardView_business_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FreeListBusiness.class));

            }
        });


        return view;
    }


    public void all_vender(View view) {
        startActivity(new Intent(getActivity(), Vender_Category.class));
    }

    public void city(View view) {
        startActivity(new Intent(getActivity(), City_Select.class));

    }

}