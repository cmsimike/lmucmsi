package edu.lmu.cmsi.mike.mavenperson.person;

import edu.lmu.cmsi.mike.mavenperson.person.parts.Foot;
import edu.lmu.cmsi.mike.mavenperson.person.parts.Name;

/* Our Person representation, in a Java package */
public class Person {

  private int age;
  private Name name;
  private Foot left;
  private Foot right;

  public Person(int age, Name name, Foot leftFoot, Foot rightFoot) {
    // Let's check to make sure we get good values
    if (name == null || leftFoot == null || rightFoot == null) {
      throw new IllegalArgumentException("Please make sure all constructor parameters are non-null");
    }

    this.age = age;
    this.name = name;
    this.left = leftFoot;
    this.right = rightFoot;
    this.checkAge();

    // new restriction - feet must be of equal length
    // can you explain why we're checking it at the person level rather than the foot level?
    if (this.getLeftFoot().getSize() != this.getRightFoot().getSize()) {
      throw new IllegalArgumentException("Feet need to be equal in size");
    }
  }

  public int getAge() {
    return this.age;
  }

  /*
   * Increments the age and checks to make sure it's still in a valid range
   */
  public void birthday() {
    this.age++;
    this.checkAge();
  }

  public Name getName() {
    return this.name;
  }

  public Foot getRightFoot() {
    return this.right;
  }

  public Foot getLeftFoot() {
    return this.left;
  }

  /* Is the age still correct? */
  private void checkAge() {
    if (this.age > 150 || this.age < 0) {
      throw new IllegalArgumentException("Age: " + this.age + " is not within the accepted rage of 0-150q.");
    }
  }

  @Override
  public String toString() {
    return "Person{" +
            "age=" + this.age +
            ", name=" + this.name.getFullName() +
            ", leftFootSize=" + this.left.getSize() +
            ", rightFootSize=" + this.right.getSize() +
            "}";
  }
}
