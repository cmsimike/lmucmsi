package edu.lmu.cmsi.mike.numericprogression.progressions;

import edu.lmu.cmsi.mike.numericprogression.core.Progression;

/**
 * An ArithmeticProgression is a progression x(0), x(1), x(2), ...
 * such that for each x(i), x(i+1) = x(i) * b for some base b
 * which is set at the time that the progression was created.
 */
public class GeometricProgression extends Progression {
  private int base;

  public GeometricProgression(int start, int base) {
    super(start);
    this.base = base;
  }

  public void advance() {
    this.nextValue *= this.base;
  }
}