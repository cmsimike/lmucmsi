package edu.lmu.cmsi.mike.abcvsinterface;

import java.awt.Color;

public abstract class Shape implements Saveable {
    private int x;
    private int y;
    private Color color;

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Color getColor() {
        return this.color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
