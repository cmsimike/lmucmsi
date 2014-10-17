package edu.lmu.cmsi.mike.abcvsinterface;

public class Person implements Saveable {
    private String firstName;

    public Person(String s) {
        this.firstName = s;
    }

    @Override
    public String getSaveString() {
        return "Person: " + this.firstName;
    }
}
