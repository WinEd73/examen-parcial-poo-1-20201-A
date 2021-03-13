package com.oop.exam.service;

import com.oop.exam.model.Movie;


import java.util.LinkedList;

public class MovieManager {

    private LinkedList<Movie> movies;


    public Movie findMovie(String title){

        for(Movie movie: movies){
            if(movie.getTitle().equals(title)){
                return movie;
            }
        }
        return  null;
    }

    public MovieManager() {
        this.movies = new LinkedList<>();
    }

    public LinkedList<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie lordOfTheRings1){
        movies.add(lordOfTheRings1);
    }
}
