
package edu.lmu.cmsi.mike.mavenperson.person.parts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class NameTest {

  @Test
  public void getFirstNameTest() {
    Name name = new Name("Mike", "Megally");
    assertEquals("failure - first name didn't match", "Mike",
            name.getFirstName());
  }

  @Test
  public void getLastNameTest() {
    Name name = new Name("Mike", "Megally");
    assertEquals("failure - last name didn't match", "Megally", name.getLastName());
  }

  @Test
  public void firstNameCapitalizedTest() {
    Name name = new Name("mike", "Megally");
    assertEquals("failure - first name didn't capitalize", "Mike",
            name.getFirstName());
  }

  @Test
  public void lastNameCapitalizedTest() {
    Name name = new Name("Mike", "megally");
    assertEquals("failure - last name didn't capitalize", "Megally", name.getLastName());
  }

  @Test
  public void getFullNameTest() {
    Name name = new Name("Mike", "Megally");
    assertEquals("failure - full name not expected", "Mike Megally", name.getFullName());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNullFirstName() {
    Name name = new Name(null, "Megally");
    fail("Name was created with a null first name!");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNullLastName() {
    Name name = new Name("Mike", null);
    fail("Name was created with a null last name!");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBlankFirstName() {
    Name name = new Name("", "Megally");
    fail("Name was created with a blank first name!");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBlankLastName() {
    Name name = new Name("Mike", "");
    fail("Name was created with a blank last name!");
  }
}
