package edu.lmu.cmsi.mike.bettergame.gameobjects;

public class Wall extends UnmovableGameObject {
  public Wall(int x, int y) {
    super(x, y);
  }
  public char getRenderedCharacter() {
    return 'w';
  }
}