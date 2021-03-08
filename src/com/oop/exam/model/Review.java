package com.oop.exam.model;

public class Review {

    public String score;
    public String review;
    public String user;


    public void review(String name, MovieScore moviescore, String review){
        this.user = user;
        this.review = review;
        this.score = score;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }



}
