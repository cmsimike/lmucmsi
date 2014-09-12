package edu.lmu.cmsi.mike.mavenexample;

public class App {

  public static void main(String[] args) {
    System.out.println("Hello, world!");

    if (args.length > 0) {
      System.out.println("You've given me some args!");
      for (int i = 0; i < args.length; i++) {
        System.out.println("arg" + i + ": " + args[i]);
      }
    }

    System.out.println("LameSubtractor! Subtracting 2 from 4");
    LameSubtract ls = new LameSubtract();
    System.out.println(ls.subtract(4, 2));
  }

}