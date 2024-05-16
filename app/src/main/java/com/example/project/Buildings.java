package com.example.project;

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
    public String getCity(String city) {
        return city;
    }

    public void setLocation(String Location) {
        this.city = city;
    }

    //Getters and cetters for country
    public String getCountry(String country) {
        return country;
    }

    public void setCountry(String Country) {
        this.country = country;

    }
    //Getters and cetters for floors
    public String getFloors(String country) {
        return country;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

}