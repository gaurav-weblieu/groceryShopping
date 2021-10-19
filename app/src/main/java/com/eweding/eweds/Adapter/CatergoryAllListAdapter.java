package com.eweding.eweds.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.eweding.eweds.Activity.ProductDetaislActivity;
import com.eweding.eweds.R;

public class CatergoryAllListAdapter extends RecyclerView.Adapter<CatergoryAllListAdapter.ViewHolder>{

    private final Context context;

    public CatergoryAllListAdapter(Context context) {
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.category_full_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.lineraLayout_det.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, ProductDetaislActivity.class));
            }
        });

    }


    @Override
    public int getItemCount() {
        return 12;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        LinearLayout lineraLayout_det;

        public ViewHolder(View itemView) {
            super(itemView);
            this.textView = (TextView) itemView.findViewById(R.id.textView_name);
            this.lineraLayout_det =  itemView.findViewById(R.id.lineraLayout_det);
        }
    }
}
