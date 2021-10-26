package com.eweding.eweds.Adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.eweding.eweds.R;

public class PopularListAdapter extends RecyclerView.Adapter<PopularListAdapter.ViewHolder>{

    private final Context context;

    public PopularListAdapter(Context context) {
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.planing_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 9;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        ImageView image_icon;
        public ViewHolder(View itemView) {
            super(itemView);
            this.textView =  itemView.findViewById(R.id.textView_name);
            this.image_icon =  itemView.findViewById(R.id.image_icon);
        }
    }
}
