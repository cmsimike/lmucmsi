package edu.lmu.cmsi.mike.lamegame.gameobjects;

import edu.lmu.cmsi.mike.lamegame.core.Coordinate;
import edu.lmu.cmsi.mike.lamegame.core.Displacement;

import edu.lmu.cmsi.mike.lamegame.gameobjects.Wall;

public class Monster {

  private Coordinate location;
  private Displacement displacement;

  public Monster(int x, int y, int dx, int dy) {
    this.location = new Coordinate(x, y);
    this.displacement = new Displacement(dx, dy);
  }

  public int getX() {
    return this.location.getX();
  }

  public int getY() {
    return this.location.getY();
  }

  public char getRenderedCharacter() {
    return 'm';
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
  //public void checkCollision(Player m);
  //public void checkCollision(Boss b);
}