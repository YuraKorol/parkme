package com.example.yura.parkme.models;

/**
 * Created by Dell on 13.12.2017.
 */

public class Distance {
    private String text;

    private String value;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ClassPojo [text = " + text + ", value = " + value + "]";
    }

}
