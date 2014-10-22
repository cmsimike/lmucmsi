package edu.lmu.cmsi.mike.bettergame.engine;

import edu.lmu.cmsi.mike.bettergame.gameobjects.GameObject;
import edu.lmu.cmsi.mike.bettergame.gameobjects.Wall;
import edu.lmu.cmsi.mike.bettergame.gameobjects.Player;
import edu.lmu.cmsi.mike.bettergame.gameobjects.Monster;

public class GameEngine {

  private int frame;
  // Side of the world
  private int size;

  // Game Objects
  private GameObject[] gameObjects;
  // helper to add GameObjects easily
  private int gameObjectCount = 0;
  // constant for max objects in the world. Increase to allow more Game Objects
  private final int MAX_GAME_OBJECTS = 100;

  public GameEngine(int size) {
    if (size < 1) {
      throw new IllegalArgumentException("The world should exist");
    }
    this.frame = 0;
    this.size = size;
    this.gameObjects = new GameObject[MAX_GAME_OBJECTS];

    // do this in a separate method to keep the constructor clean
    this.createWalls();

    this.addGameObject(new Player(3, 4));

    this.addGameObject(new Monster(4, 3, 1, 0));
    this.addGameObject(new Monster(10, 12, 0, 1));
    this.addGameObject(new Monster(8, 17, 1, 1));
  }

  // helper method to quickly add GameObjects to our world array.
  private void addGameObject(GameObject gameObject) {
    if(this.gameObjectCount >= MAX_GAME_OBJECTS) {
      throw new IllegalStateException("Max world hit!");
    }

    this.gameObjects[this.gameObjectCount] = gameObject;
    this.gameObjectCount++;
  }

  private void createWalls() {
    // Let's create walls
    //for now, we only care about putting walls on the edges

    for (int x = 0; x < this.size; x++) {
      Wall x1 = new Wall(x, 0);
      this.addGameObject(x1);

      Wall x2 = new Wall(x, this.size - 1);
      this.addGameObject(x2);
    }

    for (int y = 1; y < size - 1; y++) {
      Wall y1 = new Wall(0, y);
      this.addGameObject(y1);
      Wall y2 = new Wall(this.size - 1, y);
      this.addGameObject(y2);
    }
  }

  // the main update loop
  public void update() {
    this.frame++;
    this.render();
    this.updateObjects();
    this.checkCollisions();
  }

  private void render() {
    // Strings are a bit overkill here but easier to represent a String as a null than a character
    String[][] renderedWorld = new String[this.size][this.size];

    // calculate where everything is in the world
    for(int i = 0; i < this.gameObjectCount; i++) {
      GameObject w = this.gameObjects[i];
      renderedWorld[w.getY()][w.getX()] = Character.toString(w.getRenderedCharacter());
    }

    // Render the world
    System.out.println("=========================");
    System.out.println("Frame: " + this.frame);  // book keeping

    for (int row = 0; row < renderedWorld.length; row++) {
      String[] rowOfWorld = renderedWorld[row];
      for (int col = 0; col < rowOfWorld.length; col++) {
        String w = rowOfWorld[col];
        // If our string is null
        if (w == null) {
          w = ".";
        }
        System.out.print(w + " ");
      }
      System.out.println(""); // print a new line between each scene
    }

    System.out.println("=========================");
  }

  private void updateObjects() {
    for(int i = 0; i < this.gameObjectCount; i ++) {
      GameObject w = this.gameObjects[i];
      w.update();
    }
  }

  // Check every game object for a collision with another game object
  private void checkCollisions() {
    for(int i = 0; i < this.gameObjectCount; i ++) {
      GameObject w = this.gameObjects[i];
      for(int j = 0; j < this.gameObjectCount; j++) {
        GameObject e = this.gameObjects[j];
        w.checkCollision(e);
      }
    }
  }
}