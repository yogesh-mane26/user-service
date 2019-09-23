package com.imdb.user.userservice.model;

public class User {
    private String uID;
    private Long mID;

    public User() {

    }

    public User(String uID, Long mID) {
        this.uID = uID;
        this.mID = mID;
    }

    public String getuID() {
        return uID;
    }

    public void setuID(String uID) {
        this.uID = uID;
    }

    public Long getmID() {
        return mID;
    }

    public void setmID(Long mID) {
        this.mID = mID;
    }
}
