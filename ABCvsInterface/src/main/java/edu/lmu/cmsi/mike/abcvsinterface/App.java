package edu.lmu.cmsi.mike.abcvsinterface;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(3, 3, 4, Color.BLUE),
            new Square(10, 6, 7, Color.RED),
            new Triangle(5, 6, 2, 3, Color.CYAN)
        };

        Person p = new Person("mike");

        for(int i = 0; i < shapes.length; i++) {
            Shape s = shapes[i];
            prettyPrint(s);
            save(s);
        }

        save(p);

    }

    private static final void prettyPrint(Shape s) {
        System.out.println("");
        System.out.println("I am a " + s.getClass().getSimpleName() + " at x: " + s.getX() + " and y: " + s.getY() + " with color: " + s.getColor());
        System.out.println("My area is: " + s.getArea() + " and perimeter is: " + s.getPerimeter());
        System.out.println("");
    }

    private static void save(Saveable s) {
        System.out.println(s.getSaveString());
    }
}

