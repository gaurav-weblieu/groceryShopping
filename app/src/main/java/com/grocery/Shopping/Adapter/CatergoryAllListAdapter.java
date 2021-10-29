package com.grocery.Shopping.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.grocery.Shopping.Activity.ProductDetaislActivity;
import com.grocery.Shopping.R;

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

                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) context,holder.ivProfile,"imageMain");
                // activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) context,holder.textView,"textVew_name");
                Intent in = new Intent(context,ProductDetaislActivity.class);
               context. startActivity(in,activityOptionsCompat.toBundle());


               /* Intent intent = new Intent(context, ProductDetaislActivity.class);
                //intent.putExtra(ObjectDetailActivity.EXTRA_OBJECT, object);
                Pair<View, String> p1 = Pair.create(holder.ivProfile,"imageMain");
                Pair<View, String> p2 = Pair.create(holder.textView,"textVew_name");
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(this, p1, p2);
                context.startActivity(intent, options.toBundle());*/

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
        ImageView ivProfile;

        public ViewHolder(View itemView) {
            super(itemView);
            this.textView = (TextView) itemView.findViewById(R.id.textView_name);
            this.lineraLayout_det =  itemView.findViewById(R.id.lineraLayout_det);
            this.ivProfile =  itemView.findViewById(R.id.ivProfile);
        }
    }
}
