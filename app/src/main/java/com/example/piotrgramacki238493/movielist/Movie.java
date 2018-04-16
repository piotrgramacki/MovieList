package com.example.piotrgramacki238493.movielist;

import java.util.ArrayList;

/**
 * Created by Piotrek on 2018-03-22.
 */

public class Movie {
    private String title;
    private String category;
    private int photo;
    private ArrayList<User> actors;

    public Movie(String title, String category, int photo) {
        this.title = title;
        this.category = category;
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getPhoto() {
        return photo;
    }
}
