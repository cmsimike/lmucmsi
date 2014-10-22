package edu.lmu.cmsi.mike.abcvsinterface;
import java.awt.Color;

public class Circle extends Shape {
    private int radius;
    public Circle(int radius, int x, int y, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String getSaveString() {
        return "Triangle: x:" + this.getX() + "y:" + this.getY() + "color:" + this.getColor();
    }
}
