package com.oop.exam.service;

import com.oop.exam.model.Movie;
import com.oop.exam.model.Review;

import java.util.LinkedList;

public class MovieManager {

    private LinkedList<Movie> movies;

    public MovieManager(LinkedList<Movie> movies) {
        this.movies = movies;
    }
    public String findMovie(Movie movie){
        return  movie.getTitle();
    }

    public MovieManager() {
        this.movies = new LinkedList<>();
    }

    public LinkedList<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie){
        movie.add(movie);
    }
}
