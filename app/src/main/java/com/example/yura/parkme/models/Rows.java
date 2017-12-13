package com.example.yura.parkme.models;

/**
 * Created by Dell on 13.12.2017.
 */

public class Rows {
    private Elements[] elements;

    public Elements[] getElements() {
        return elements;
    }

    public void setElements(Elements[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "ClassPojo [elements = " + elements + "]";
    }

}
