package com.example.yura.parkme.models;

/**
 * Created by Dell on 13.12.2017.
 */

public class Parkings {
    private String parkingName;

    private Coordnates coordnates;

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public Coordnates getCoordnates() {
        return coordnates;
    }

    public void setCoordnates(Coordnates coordnates) {
        this.coordnates = coordnates;
    }

    @Override
    public String toString() {
        return "ClassPojo [parkingName = " + parkingName + ", coordnates = " + coordnates + "]";
    }

}
