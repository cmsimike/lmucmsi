package edu.lmu.cmsi.mike.bettergame.gameobjects;

import edu.lmu.cmsi.mike.bettergame.core.Coordinate;
import edu.lmu.cmsi.mike.bettergame.core.Displacement;

public abstract class GameObject {

  private Coordinate location;
  private Displacement displacement;

  public GameObject(int x, int y, int dx, int dy) {
    this.location = new Coordinate(x, y);
    this.displacement = new Displacement(dx, dy);
  }

  public GameObject(int x, int y)
  {
    this(x, y, 0, 0);
  }

  public int getX() {
    return this.location.getX();
  }

  public int getY() {
    return this.location.getY();
  }

  public void update() {
    // only update if we have a "direction" to move to
    if(this.displacement != null) {
      this.location.setX(this.location.getX() + this.displacement.getXDisplacement());
      this.location.setY(this.location.getY() + this.displacement.getYDisplacement());
    }
  }

  /**
   * Does the required calculation to decide if we've hit another game object.
   * Returns true if the game object is not myself and the x and y coords match.
   * False otherwise.
   *
   * @param other The other GameObject to check
   * @return Whether or not the game object and this object collided
   */
  protected boolean collidedWith(GameObject other) {
    return (this != other) && (this.getX() == other.getX() && this.getY() == other.getY());
  }

  protected void invert() {
    this.displacement.invert();
  }

  public abstract char getRenderedCharacter();

  public abstract void checkCollision(GameObject other);
}
