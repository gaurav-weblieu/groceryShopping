package com.grocery.shopping.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.grocery.shopping.Activity.BlogDetails;
import com.grocery.shopping.R;

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

        holder.imageView_ani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, BlogDetails.class));
            }
        });

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
