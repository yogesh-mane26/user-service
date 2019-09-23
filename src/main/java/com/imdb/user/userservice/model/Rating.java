package com.imdb.user.userservice.model;


public class Rating {

    private int mID;
    private int rating;

    public Rating(){

    }
    public Rating(int mID, int rating) {
        this.mID = mID;
        this.rating = rating;
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
