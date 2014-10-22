package edu.lmu.cmsi.mike.bettergame.gameobjects;

public class Monster extends GameObject {

  public Monster(int x, int y, int dx, int dy) {
    super(x, y, dx, dy);
  }

  @Override
  public char getRenderedCharacter() {
    return 'm';
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