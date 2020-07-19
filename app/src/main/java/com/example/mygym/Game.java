package com.example.mygym;

import java.io.Serializable;

public class Game implements Serializable {
    private String GameType;
    private int image;


    public Game(String gameType, int image) {
        GameType = gameType;
        this.image = image;



    }

    public String getGameType() {
        return GameType;
    }

    public void setGameType(String gameType) {
        GameType = gameType;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
