package com.eweding.eweds.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.eweding.eweds.Activity.VideoActivity;
import com.eweding.eweds.R;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder>{

    private final Context context;

    public VideoAdapter(Context context) {
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.video_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.cardView_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, VideoActivity.class));
            }
        });

    }


    @Override
    public int getItemCount() {
        return 12;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView_video;

        public ViewHolder(View itemView) {
            super(itemView);

            cardView_video= itemView.findViewById(R.id.cardView_video);


        }
    }
}
