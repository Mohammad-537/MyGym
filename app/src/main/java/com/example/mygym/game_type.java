package com.example.mygym;

import java.io.Serializable;

public class game_type implements Serializable {

    private String Game_type;
    private int Game_type_image;
    private String requierments;

    public String getGame_type() {
        return Game_type;
    }

    public void setGame_type(String game_type) {
        Game_type = game_type;
    }

    public int getGame_type_image() {
        return Game_type_image;
    }

    public void setGame_type_image(int game_type_image) {
        Game_type_image = game_type_image;
    }

    public String getRequierments() {
        return requierments;
    }

    public void setRequierments(String requierments) {
        this.requierments = requierments;
    }

    public game_type(String game_type, int game_type_image, String requierments) {
        Game_type = game_type;
        Game_type_image = game_type_image;
        this.requierments = requierments;


    }
}
