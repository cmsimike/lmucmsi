package edu.lmu.cmsi.mike.numericprogression;

import edu.lmu.cmsi.mike.numericprogression.core.Progression;
import edu.lmu.cmsi.mike.numericprogression.progressions.ArithmeticProgression;
import edu.lmu.cmsi.mike.numericprogression.progressions.FibonacciProgression;
import edu.lmu.cmsi.mike.numericprogression.progressions.GeometricProgression;

public class App {

  /**
   * Defines a few progression objects of different progression classes
   * and prints the first 20 values of each to System.out.
   * It is simply meant as an introductory example of polymorphism.
   */
  public static void main(String[] args) {
    showInitialSequence(new ArithmeticProgression(10, 4));
    showInitialSequence(new ArithmeticProgression(-25, 5));
    showInitialSequence(new GeometricProgression(1, 2));
    showInitialSequence(new FibonacciProgression());
  }

  /**
   * Displays the first 20 values from the given progression.
   */
  public static void showInitialSequence(Progression p) {
    System.out.print("( ");
    for (int i = 0; i < 20; i++) {
      System.out.print(p.next() + " ");
    }
    System.out.println(")");
  }
}
