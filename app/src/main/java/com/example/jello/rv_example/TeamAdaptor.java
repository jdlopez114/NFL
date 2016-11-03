package com.example.jello.rv_example;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;


public class TeamAdaptor extends RecyclerView.Adapter {

    private List<TeamDescription> mData = Arrays.asList(
            new TeamDescription("49ers", R.drawable.team_49ers),
            new TeamDescription("Bears", R.drawable.team_bears),
            new TeamDescription("Bengals", R.drawable.team_benagls),
            new TeamDescription("Bills", R.drawable.team_bills),
            new TeamDescription("Broncos", R.drawable.team_broncos),
            new TeamDescription("Browns", R.drawable.team_browns),
            new TeamDescription("Buccaneers", R.drawable.team_bucs),
            new TeamDescription("Cardinals", R.drawable.team_cards),
            new TeamDescription("Chargers", R.drawable.team_chargers),
            new TeamDescription("Chiefs", R.drawable.team_chiefs),
            new TeamDescription("Colts", R.drawable.team_colts),
            new TeamDescription("Cowboys", R.drawable.team_cowboys),
            new TeamDescription("Dolphins", R.drawable.team_dolphins),
            new TeamDescription("Eagles", R.drawable.team_eagles),
            new TeamDescription("Falcons", R.drawable.team_falcons),
            new TeamDescription("Giants", R.drawable.team_giants),
            new TeamDescription("Jaguars", R.drawable.team_jags),
            new TeamDescription("Jets", R.drawable.team_jets),
            new TeamDescription("Lions", R.drawable.team_lions),
            new TeamDescription("Packers", R.drawable.team_packers),
            new TeamDescription("Panthers", R.drawable.team_panthers),
            new TeamDescription("Patriots", R.drawable.team_pats),
            new TeamDescription("Raiders", R.drawable.team_raiders),
            new TeamDescription("Rams", R.drawable.team_rams),
            new TeamDescription("Ravens", R.drawable.team_ravens),
            new TeamDescription("Redskins", R.drawable.team_redskins),
            new TeamDescription("Saints", R.drawable.team_saints),
            new TeamDescription("Seahawks", R.drawable.team_seahwaks),
            new TeamDescription("Steelers", R.drawable.team_steelers),
            new TeamDescription("Texans", R.drawable.team_texans),
            new TeamDescription("Vikings", R.drawable.team_vikings)
    );


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TeamHolder((parent));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        TeamHolder teamHolder = (TeamHolder) holder;
        TeamDescription team = mData.get(position);
        teamHolder.bind(team);
        teamHolder.setOnClickListener(buildTeamClickListener(team));
    }

    private View.OnClickListener buildTeamClickListener(TeamDescription team) {
        if (team != null) {
            return navigateToTeamViewListener(team.getName());
        }
        return defaultClickListener();
    }

    private View.OnClickListener navigateToTeamViewListener(final String name) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TeamView.class);
                intent.putExtra(TeamView.TEAM_NAME, name);
                view.getContext().startActivity(intent);
            }
        };
    }

    private View.OnClickListener defaultClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do Nothing
            }
        };
    }

    @Override
    public int getItemCount() {
        return mData.size();

    }
}



