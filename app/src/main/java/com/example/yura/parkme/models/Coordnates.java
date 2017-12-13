package com.example.yura.parkme.models;

/**
 * Created by Dell on 13.12.2017.
 */

public class Coordnates {
    public String longtitude;

    public String latitude;

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "ClassPojo [longtitude = " + longtitude + ", latitude = " + latitude + "]";
    }

}
