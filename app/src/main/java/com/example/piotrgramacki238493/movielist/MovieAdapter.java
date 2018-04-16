package com.example.piotrgramacki238493.movielist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Piotrek on 2018-03-22.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{
    private ArrayList<Movie> movies;

    public MovieAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout itemView;
        ImageView image;
        TextView name;
        TextView category;

        public ViewHolder(LinearLayout itemView) {
            super(itemView);
            this.itemView = itemView;
            image = itemView.findViewById(R.id.main_recycler_view_image);
            name = itemView.findViewById(R.id.main_recycler_view_name);
            category = itemView.findViewById(R.id.main_recycler_view_category);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout layout = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_listview_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(layout);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(movies.get(position).getTitle());
        holder.category.setText(movies.get(position).getCategory());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
