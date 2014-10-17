package edu.lmu.cmsi.mike.abcvsinterface;

import  java.awt.Color;


public class Square extends Shape {
    private int width;

    public Square(int width, int x, int y, Color color) {
        super(x, y, color);
        this.width = width;
    }

    @Override
    public double getArea(){
        return this.width * this.width;
    }

    @Override
    public double getPerimeter() {
        return this.width * 4;
    }

    public String getSaveString() {
        return "Square: x:" + this.getX() + "y:" + this.getY() + "color:" + this.getColor();
    }
}
