package com.androidmani.daggerretrofitex.model;

import com.google.gson.annotations.SerializedName;

public class User {

    private int id;
    private String email;
    @SerializedName("first_name") //SerializedName is a gson annotation
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("avatar")
    private String image;

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return firstName;
    }

    public String getLast_name() {
        return lastName;
    }

    public String getImage() {
        return image;
    }
}
