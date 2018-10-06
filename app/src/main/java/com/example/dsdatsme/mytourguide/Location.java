package com.example.dsdatsme.mytourguide;

public class Location {
    private int locationName;
    private int locationImage;
    private int locationDescription;

    //Constructor
    public Location(int name, int image, int description) {
        this.locationName = name;
        this.locationDescription = description;
        this.locationImage = image;
    }

    public int getLocationName() {
        return this.locationName;
    }

    public int getLocationImage() {
        return this.locationImage;
    }

    public int getLocationDescription() {
        return this.locationDescription;
    }
}
