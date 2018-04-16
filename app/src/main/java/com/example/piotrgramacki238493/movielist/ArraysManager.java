package com.example.piotrgramacki238493.movielist;

import java.util.ArrayList;

/**
 * Created by Piotrek on 2018-03-22.
 */

public abstract class ArraysManager {
    private static ArrayList<Movie> movies = null;

    public static ArrayList<Movie> getMovies() {
        if (movies == null) {
            setData();
        }
        return movies;
    }

    private static void setData() {
        movies = new ArrayList<>();
        movies.add(new Movie("Top gun", "movie", 0));
        movies.add(new Movie("LOTR", "movie", 0));
    }
}
