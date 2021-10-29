package com.grocery.Shopping.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.grocery.Shopping.Activity.CatergoryFullListActivity;
import com.grocery.Shopping.Fragment.HomeFragment;
import com.grocery.Shopping.R;

public class CatergoryAdapter extends RecyclerView.Adapter<CatergoryAdapter.ViewHolder>{

    private final Context context;
    private final HomeFragment homeFragment;

    public CatergoryAdapter(Context context, HomeFragment homeFragment) {
        this.context = context;
        this.homeFragment = homeFragment;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.category_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.lineraLayout_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, CatergoryFullListActivity.class));
            }
        });

        if (position==11){
            homeFragment.lastCat();
        }else {
            homeFragment.notLastCat();
        }
    }


    @Override
    public int getItemCount() {
        return 12;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        LinearLayout lineraLayout_cat;
        public TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);

            this.textView = (TextView) itemView.findViewById(R.id.textView_name);
            this.lineraLayout_cat =  itemView.findViewById(R.id.lineraLayout_cat);
        }
    }
}
