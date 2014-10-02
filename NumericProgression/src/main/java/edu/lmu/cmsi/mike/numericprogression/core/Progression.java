package edu.lmu.cmsi.mike.numericprogression.core;

public abstract class Progression {

  /**
   * The place to store the next value to return from next()
   */
  protected int nextValue;

  public Progression() {
    this.nextValue = 0;
  }

  public Progression(int initialValue) {
    this.nextValue = initialValue;
  }

  public int next() {
    int valueToReturn = this.nextValue;
    this.advance();
    return valueToReturn;
  }

  protected abstract void advance();
}