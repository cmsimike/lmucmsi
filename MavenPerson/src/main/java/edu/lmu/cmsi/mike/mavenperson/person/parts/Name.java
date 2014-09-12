
package edu.lmu.cmsi.mike.mavenperson.person.parts;

public class Name {
  private String firstName;
  private String lastName;

  public Name(String firstName, String lastName) {
    if (firstName == null || lastName == null || firstName.length() == 0 || lastName.length() == 0) {
      throw new IllegalArgumentException("First name and/or last name cannot be blank");
    }
    this.firstName = this.ensureProperCase(firstName);
    this.lastName = this.ensureProperCase(lastName);
  }

  /*
   * Checks the String to make sure the first letter is capitalized. If it is,
   * just return the string. If it isn't, return the string with the first
   * letter capitalized
   */
  private String ensureProperCase(String s) {
    // This is save because the constructor is checking to make sure the
    // arguments aren't null or empty
    if (!Character.isUpperCase(s.charAt(0))) {
      s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    return s;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getFullName() {
    return this.getFirstName() + " " + this.getLastName();
  }
}
