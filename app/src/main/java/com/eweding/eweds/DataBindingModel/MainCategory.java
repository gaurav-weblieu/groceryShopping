package com.eweding.eweds.DataBindingModel;

import android.widget.ImageView;


import com.bumptech.glide.Glide;

public class MainCategory {

    public MainCategory(String name, String image_url) {
        this.name = name;
        Image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return Image_url;
    }

    public void setImage_url(String image_url) {
        Image_url = image_url;
    }

    private String name;
    private  String Image_url;



}
