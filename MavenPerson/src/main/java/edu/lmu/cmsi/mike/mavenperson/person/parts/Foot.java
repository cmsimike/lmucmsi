package edu.lmu.cmsi.mike.mavenperson.person.parts;

/*
 * Our foot representation
 */
public class Foot {
  private int size;
  private boolean lifted;

  public Foot(int size, boolean lifted) {
    this.size = size;
    this.lifted = lifted;
  }

  public int getSize() {
    return this.size;
  }

  public boolean isLifted() {
    return this.lifted;
  }

  public void setLifted(boolean lifted) {
    this.lifted = lifted;
  }
}
