package edu.lmu.cmsi.mike.mavenperson;

import edu.lmu.cmsi.mike.mavenperson.person.Person;
import edu.lmu.cmsi.mike.mavenperson.person.parts.Foot;
import edu.lmu.cmsi.mike.mavenperson.person.parts.Name;

public class App {
  public static void main(String[] args) {
    Name name = new Name("mike", "megally");
    Foot left = new Foot(10, false);
    Foot right = new Foot(10, false);

    Person p = new Person(33, name, left, right);

    System.out.println("Person successfully created " + p);
  }
}
