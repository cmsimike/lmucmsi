package edu.lmu.cmsi.mike.integerdoubler;

import java.util.Random;

import edu.lmu.cmsi.mike.integerdoubler.iface.IntegerDoubler;
import edu.lmu.cmsi.mike.integerdoubler.impl.AdditionDoubler;
import edu.lmu.cmsi.mike.integerdoubler.impl.BitShiftDoubler;
import edu.lmu.cmsi.mike.integerdoubler.impl.MultiplicationDoubler;

public class App {

  public static void main(String[] args) {

    // Random int generation
    Random generator = new Random();

    IntegerDoubler[] intDoubleProvider = new IntegerDoubler[]{
        new AdditionDoubler(),
        new BitShiftDoubler(),
        new MultiplicationDoubler()
    };

    for(int i = 0; i < intDoubleProvider.length; i++) {
      IntegerDoubler doubler = intDoubleProvider[i];
      doubleInt(generator.nextInt(1000000), doubler);
    }
  }

  public static void doubleInt(int value, IntegerDoubler doubler) {
    System.out.println("Doubling " + value + " gives us " + doubler.doDouble(value));
  }
}
