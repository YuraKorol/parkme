package com.example.yura.parkme.models;

/**
 * Created by Dell on 12.12.2017.
 */

public class ParkingModel {
    private MyCoordnates myCoordnates;

    private String status;

    private String[] destination_addresses;

    private Parkings[] parkings;

    private String[] origin_addresses;

    private Rows[] rows;

    public MyCoordnates getMyCoordnates() {
        return myCoordnates;
    }

    public void setMyCoordnates(MyCoordnates myCoordnates) {
        this.myCoordnates = myCoordnates;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getDestination_addresses() {
        return destination_addresses;
    }

    public void setDestination_addresses(String[] destination_addresses) {
        this.destination_addresses = destination_addresses;
    }

    public Parkings[] getParkings() {
        return parkings;
    }

    public void setParkings(Parkings[] parkings) {
        this.parkings = parkings;
    }

    public String[] getOrigin_addresses() {
        return origin_addresses;
    }

    public void setOrigin_addresses(String[] origin_addresses) {
        this.origin_addresses = origin_addresses;
    }

    public Rows[] getRows() {
        return rows;
    }

    public void setRows(Rows[] rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "ClassPojo [myCoordnates = " + myCoordnates + ", status = " + status + ", destination_addresses = " + destination_addresses + ", parkings = " + parkings + ", origin_addresses = " + origin_addresses + ", rows = " + rows + "]";
    }
}
