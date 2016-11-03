package com.example.jello.rv_example;

import android.support.annotation.DrawableRes;

public class TeamDescription {

    private final String mName;
    private final Integer mImage;

    public TeamDescription(String name) {
        mName = name;
        mImage = R.drawable.nfl_logo;
    }

    public TeamDescription (String name, @DrawableRes Integer resource){
        mName = name;
        mImage = resource;
    }

    public String getName(){
        return mName;
    }

    public Integer getImageResource(){
        return mImage;
    }
}

