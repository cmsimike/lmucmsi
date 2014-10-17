package edu.lmu.cmsi.mike.abcvsinterface;
import java.awt.Color;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height, int x, int y, Color c) {
        super(x, y, c);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){
        return this.base * this.height / 2;
    }

    @Override
    public double getPerimeter() {
        return this.base +  2 * Math.sqrt(this.base * this.base + this.height * this.height);
    }

    public String getSaveString() {
        return "Triangle: x:" + this.getX() + "y:" + this.getY() + "color:" + this.getColor();
    }
}
