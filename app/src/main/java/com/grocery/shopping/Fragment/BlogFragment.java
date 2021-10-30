package com.grocery.shopping.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grocery.shopping.Adapter.BlogAdapter;
import com.grocery.shopping.R;


public class BlogFragment extends Fragment {


    RecyclerView recycleView_blog;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_blog, container, false);
        recycleView_blog=view.findViewById(R.id.recycleView_blog);

        BlogAdapter ourTipsAdapter = new BlogAdapter(getActivity());
        recycleView_blog.setHasFixedSize(true);
        recycleView_blog.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycleView_blog.setAdapter(ourTipsAdapter);

        return view;
    }
}