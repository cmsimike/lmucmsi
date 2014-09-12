
package edu.lmu.cmsi.mike.mavenperson;

import edu.lmu.cmsi.mike.mavenperson.person.Person;
import edu.lmu.cmsi.mike.mavenperson.person.parts.Foot;
import edu.lmu.cmsi.mike.mavenperson.person.parts.Name;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

  private Name name;
  private Foot left;
  private Foot right;

  // This method is run before ever single one of our tests to recreate
  // the parts needed for our person so we don't have to do that in every
  // method
  @Before
  public void initialize() {
    this.name = new Name("Mike", "Megally");
    this.left = new Foot(10, false);
    this.right = new Foot(10, false);
  }

  @Test
  public void personAgeTest() {
    Person p = new Person(99, this.name, this.left, this.right);
    assertEquals("failure - age didn't match", 99, p.getAge());
  }

  @Test(expected = IllegalArgumentException.class)
  public void personAgeTooLarge() {
    Person p = new Person(160, this.name, this.left, this.right);
  }

  @Test(expected = IllegalArgumentException.class)
  public void personAgeTooSmall() {
    Person p = new Person(-11, this.name, this.left, this.right);
  }

  @Test
  public void personBirthdayTest() {
    Person p = new Person(99, this.name, this.left, this.right);
    p.birthday();
    assertEquals("failure - age didn't match after birthday", 100, p.getAge());
  }

  @Test(expected = IllegalArgumentException.class)
  public void personBirthdayTestThrowsException() {
    Person p = new Person(150, this.name, this.left, this.right);
    p.birthday();
  }

  @Test(expected = IllegalArgumentException.class)
  public void feetSizeNotSame() {
    Foot left = new Foot(10, false);
    Foot right = new Foot(11, false);
    Person p = new Person(150, this.name, left, right);
  }
}
