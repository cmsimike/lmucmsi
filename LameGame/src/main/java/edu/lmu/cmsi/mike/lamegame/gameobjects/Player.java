package edu.lmu.cmsi.mike.lamegame.gameobjects;

import edu.lmu.cmsi.mike.lamegame.core.Coordinate;
import edu.lmu.cmsi.mike.lamegame.core.Displacement;

public class Player {

  private Coordinate location;
  private Displacement displacement;

  public Player(int x, int y) {
    this.location = new Coordinate(x, y);
    this.displacement = new Displacement(1, 0);
  }

  public int getX() {
    return this.location.getX();
  }

  public int getY() {
    return this.location.getY();
  }

  public char getRenderedCharacter() {
    return 'p';
  }

  public void update() {
    this.location.setX(this.location.getX() + this.displacement.getXDisplacement());
    this.location.setY(this.location.getY() + this.displacement.getYDisplacement());
  }


  public void checkCollision(Wall w) {
    if (this.getX() == w.getX() && this.getY() == w.getY()) {
      displacement.invert();
    }
  }

  // You need to know about all this if you want to continue down this path
  //public void checkCollision(Monster m);
  //public void checkCollision(Boss b);
}