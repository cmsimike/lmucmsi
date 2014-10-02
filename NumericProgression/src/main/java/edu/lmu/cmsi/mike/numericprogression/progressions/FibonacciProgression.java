package edu.lmu.cmsi.mike.numericprogression.progressions;

import edu.lmu.cmsi.mike.numericprogression.core.Progression;

/**
 * A FibonacciProgression is the progression 0, 1, 1, 2, 3, 5, 8,
 * 13, 21, 34, 55, 89, 144, ..., that is, x(0), x(1), x(2), ...
 * such that for each x(i), x(i+2) = x(i) + x(i+1).
 */
public class FibonacciProgression extends Progression {

  protected int previous;

  public FibonacciProgression() {
    super(0);
    this.previous = 1; // hack to make it work :-)
  }

  @Override
  protected void advance() {
    int oldPreviousValue = this.previous;
    this.previous = this.nextValue;
    this.nextValue += oldPreviousValue;
  }
}