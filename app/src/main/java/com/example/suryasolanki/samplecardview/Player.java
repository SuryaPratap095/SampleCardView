package com.example.suryasolanki.samplecardview;

/**
 * Created by surya.solanki on 16-11-2016.
 */

public class Player {

    private String PlayerName;
    private int realImage;

    public Player() {
    }

    public Player(String playerName, int realImage) {
        PlayerName = playerName;
        this.realImage = realImage;
    }

    public String getPlayerName() {
        return PlayerName;
    }
    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public int getRealImage() {
        return realImage;
    }

    public void setRealImage(int realImage) {
        this.realImage = realImage;
    }

    @Override
    public String toString() {
        return "Player{" +
                "PlayerName='" + PlayerName + '\'' +
                ", realImage=" + realImage +
                '}';
    }
}
