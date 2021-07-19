package com.example.jaipur;

public class LocationImage {
    private int ImageResourceId;
    private String name,text1,text2,text3,text4,Location;
    LocationImage(int ImageResourceId,String Location,String name,String text1,String text2,String text3,String text4)
    {
        this.ImageResourceId=ImageResourceId;
        this.Location=Location;
        this.name=name;
        this.text1=text1;
        this.text2=text2;
        this.text3=text3;
        this.text4=text4;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public String getText1() {
        return text1;
    }

    public String getLocation() {
        return Location;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

    public String getText4() {
        return text4;
    }
}
