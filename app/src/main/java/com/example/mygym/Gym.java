package com.example.mygym;

import java.io.Serializable;

public class Gym implements Serializable {
    private String club_name;
    private String since;
    private int image;

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

    public Gym(String club_name, String since, int image) {
        this.club_name = club_name;
        this.since = since;
        this.image = image;

    }
}
