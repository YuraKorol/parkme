package com.example.yura.parkme.network;

import android.content.Context;
import android.content.res.Resources;

import com.example.yura.parkme.R;
import com.example.yura.parkme.models.ParkingModel;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Dell on 12.12.2017.
 */

public class HTTPConnection {
    //mock call to server API
    public static ParkingModel parkingList(Context ctx, double longtitue, double latitute) {
        Gson gson = new Gson();

        ParkingModel list = null;

        try {
            Resources res = ctx.getResources();
            InputStream inputStream = res.openRawResource(R.raw.json);
            InputStreamReader inputreader = new InputStreamReader(inputStream);

            BufferedReader buffreader = new BufferedReader(inputreader);

            list = gson.fromJson(buffreader, ParkingModel.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
