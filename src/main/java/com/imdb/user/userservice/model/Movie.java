package com.imdb.user.userservice.model;

public class Movie {

    private String mid;
    private String name;

    public Movie(){

    }
    public Movie(String mid, String name) {
        this.mid = mid;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
