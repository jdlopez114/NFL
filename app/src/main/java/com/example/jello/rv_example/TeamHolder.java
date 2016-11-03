package com.example.jello.rv_example;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class TeamHolder extends RecyclerView.ViewHolder {

    private final View mView;
    private final ImageView mTeamPic;
    private final TextView mTeamName;


    public TeamHolder(ViewGroup parent) {
        super(inflateView(parent));
        mView = itemView;
        mTeamPic = (ImageView) mView.findViewById(R.id.team_pic);
        mTeamName = (TextView) mView.findViewById(R.id.team_name);
    }

    private static View inflateView (ViewGroup parent) {
        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        return inflator.inflate(R.layout.team_view_holder, parent, false);
    }

    public void bind (TeamDescription teamDescription){
        mTeamName.setText(teamDescription.getName());
        Integer resource = teamDescription.getImageResource();
        if (resource != null){
            mTeamPic.setImageResource(resource);
        }
    }

    public TextView getName(){
        return mTeamName;
    }

    public void setOnClickListener(View.OnClickListener clickListener){
        mView.setOnClickListener(clickListener);
    }


}