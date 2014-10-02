package edu.lmu.cmsi.mike.numericprogression.progressions;


import edu.lmu.cmsi.mike.numericprogression.core.Progression;

/**
 * An ArithmeticProgression is a progression x(0), x(1), x(2), ...
 * such that for each x(i), x(i+1) = x(i) + inc for some increment
 * inc which is set at the time that the progression was created.
 */
public class ArithmeticProgression extends Progression {

  private int increment;

  public ArithmeticProgression(int start, int increment) {
    super(start);
    this.increment = increment;
  }

  @Override
  public void advance() {
    this.nextValue += this.increment;
  }
}