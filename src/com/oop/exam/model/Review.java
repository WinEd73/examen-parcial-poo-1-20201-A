package com.oop.exam.model;

public class Review {

    private MovieScore score;
    private String review;
    private User user;

    public MovieScore getScore() {
        return score;
    }

    public Review(User user, MovieScore score, String review) {
        this.score = score;
        this.review = review;
        this.user = user;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setScore(MovieScore score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
