package com.example.lab03;
import java.io.Serializable;
public class CardHistory implements Serializable {
    private int sumHades;
    private int sumBot;
    private String result;

    public CardHistory(int sumHades, int sumBot, String result) {
        this.sumHades = sumHades;
        this.sumBot = sumBot;
        this.result = result;
    }

    public int getSumHades() {
        return sumHades;
    }

    public int getSumBot() {
        return sumBot;
    }

    public String getResult() {
        return result;
    }
}

