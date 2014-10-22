package edu.lmu.cmsi.mike.bettergame.gameobjects;

public class Player extends GameObject {
  public Player(int x, int y) {
    super(x, y, 1, 0);
  }

  @Override
  public char getRenderedCharacter() {
    return 'p';
  }

  @Override
  public void checkCollision(GameObject other) {
    if (super.collidedWith(other)) {
      if(other.getRenderedCharacter() == 'w') {
        this.invert();
      }
    }
  }
}