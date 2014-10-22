package edu.lmu.cmsi.mike.bettergame.gameobjects;

public abstract class UnmovableGameObject extends GameObject {

  public UnmovableGameObject(int x, int y)
  {
    super(x, y);
  }

  @Override
  public void checkCollision(GameObject go) {
    // do nothing
    // This can be overridden in child classes to actually do something
    // if a game object and this object "hit"
  }

}
