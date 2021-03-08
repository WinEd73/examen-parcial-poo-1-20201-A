package com.oop.exam.model;

import java.util.ArrayList;

public class Movie {

    private String title;
    private String year;
    private ArrayList<Actors> actors;
    private String director;
    private ArrayList<Platform> platforms;
    private String Synopsis;
    private ArrayList<Review> reviews;



    public String getSynopsis() {
        return Synopsis;
    }

    public void setSynopsis(String synopsis) {
        Synopsis = synopsis;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public class Actors{

    }
    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public ArrayList<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(ArrayList<Platform> platforms) {
        this.platforms = platforms;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<actors> getActors() {
        return actors;
    }

    public void setActors(ArrayList<actors> actors) {
        this.actors = actors;
    }

    public void addReview(String name, MovieScore moviescore, String review){
        review.add(review);
    }

    public void reserveRoom(Review review, String title, String year, String user) {
        Reservation reservation = new Reservation();

        Review.setReview(review);
        Review.setUser(user);
        Review.setScore(score);

        reviews.add(reviews);
    }
}
