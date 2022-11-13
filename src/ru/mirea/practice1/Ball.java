package ru.mirea.practice1;

import java.util.Locale;

public class Ball {
    private String color;
    private int diameter;


    public Ball() {
        this.color = "white";
        this.diameter = 0;
    }

    public Ball(String color) {
        this.color = color.toLowerCase(Locale.ROOT);
        this.diameter = 0;
    }

    public Ball(String color, int size) {
        this.color = color.toLowerCase(Locale.ROOT);
        this.diameter = size;
    }

    public void setColor(String color) {
        this.color = color.toLowerCase(Locale.ROOT);
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getColor() {
        return this.color;
    }

    public int getDiameter() {
        return this.diameter;
    }

    @Override
    public String toString() {
        return "color: " + this.color + ", diameter: " + this.diameter;
    }
}
