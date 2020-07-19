package com.example.mygym;

import java.io.Serializable;

public class Gym2 implements Serializable {

    private String club_name;
    private String since;
    private int image;
    private String howtojoin;
    private String location;

    public Gym2(String club_name, String since, int image, String howtojoin, String location) {
        this.club_name = club_name;
        this.since = since;
        this.image = image;
        this.howtojoin = howtojoin;
        this.location = location;
    }

    public String getClub_name() {
        return club_name;
    }

    public void setClub_name(String club_name) {
        this.club_name = club_name;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHowtojoin() {
        return howtojoin;
    }

    public void setHowtojoin(String howtojoin) {
        this.howtojoin = howtojoin;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
