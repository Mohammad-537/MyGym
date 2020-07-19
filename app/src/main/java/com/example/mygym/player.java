package com.example.mygym;

import java.io.Serializable;

public class player implements Serializable {
    private String name1;
    private String height1;
    private String birthday1;
    private String Country1;
    private int image1;

    public player(String name1, String height1, String birthday1, String country1, int image1) {
        this.name1 = name1;
        this.height1 = height1;
        this.birthday1 = birthday1;
        Country1 = country1;
        this.image1 = image1;



    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getHeight1() {
        return height1;
    }

    public void setHeight1(String height1) {
        this.height1 = height1;
    }

    public String getBirthday1() {
        return birthday1;
    }

    public void setBirthday1(String birthday1) {
        this.birthday1 = birthday1;
    }

    public String getCountry1() {
        return Country1;
    }

    public void setCountry1(String country1) {
        Country1 = country1;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }
}
