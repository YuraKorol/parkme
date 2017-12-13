package com.example.yura.parkme.network;

import com.example.yura.parkme.models.ParkingModel;
import com.google.gson.Gson;

import java.io.FileReader;

/**
 * Created by Dell on 12.12.2017.
 */

public class HTTPConnection {
    //fake Sadova coords
    public static ParkingModel parkingList(double longtitue, double latitute) {
        Gson gson = new Gson();
        // 1. JSON to Java object, read it from a file.
        ParkingModel staff = gson.fromJson(new FileReader("C:\\Users\\Dell\\Desktop\\ParkMe\\app\\src\\main\\res\\raw\\json"), ParkingModel.class);

        return ParkingModel();
    }
}