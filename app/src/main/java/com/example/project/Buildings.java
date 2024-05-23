package com.example.project;

import android.os.Build;

import com.google.gson.annotations.SerializedName;

public class Buildings {
    private String ID;
    private String name;
    @SerializedName("cost")
    private int buildYear;
    @SerializedName("size")
    private int height;
    @SerializedName("category")
    private int floors;
    @SerializedName("auxdata")
    private String country;
    @SerializedName("location")
    private String city;

    //Constructor

    public Buildings(String ID, String name, int buildYear, int height, int floors, String city, String country) {
        this.ID = ID;
        this.name = name;
        this.buildYear = buildYear;
        this.height = height;
        this.floors = floors;
        this.city = city;
        this.country = country;


    }

    // Getters and setters for ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    //Getters and setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getters and setters for City
    public String getCity() {
        return city;
    }

    public void setLocation(String Location) {
        this.city = city;
    }

    //Getters and cetters for country
    public String getCountry() {
        return country;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public int getHeight() {
        return height;
    }

    public void setCountry(String Country) {
        this.country = country;



    }
    //Getters and cetters for floors
    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

}