package com.eweding.eweds.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.eweding.eweds.Activity.CatergoryFullListActivity;
import com.eweding.eweds.R;

public class BlogAdapter extends RecyclerView.Adapter<BlogAdapter.ViewHolder>{

    private final Context context;

    public BlogAdapter(Context context) {
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.blog_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

      /*  RotateAnimation anim = new RotateAnimation(0f, 350f, 15f, 15f);
        anim.setInterpolator(new LinearInterpolator());
        anim.setRepeatCount(Animation.INFINITE);
        anim.setDuration(700);


        holder.imageView_ani.startAnimation(anim);*/


        Animation animation1 =
                AnimationUtils.loadAnimation(context, R.anim.blink);
        holder.imageView_ani.startAnimation(animation1);



      //  holder.imageView_ani.setAnimation(null);

    }


    @Override
    public int getItemCount() {
        return 12;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView_ani;
        public ViewHolder(View itemView) {
            super(itemView);

            this.imageView_ani = (ImageView) itemView.findViewById(R.id.imageView_ani);
        }
    }
}
