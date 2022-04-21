package com.person;

public class Teacher extends Person {

  private String degreeLevel;

  public Teacher(String firstName, String lastName, int age, String location, String degreeLevel) {
    super(firstName, lastName, age, location);
    this.degreeLevel = degreeLevel;
  }

  public String getDegreeLevel() {
    return degreeLevel;
  }

  public void setDegreeLevel(String degreeLevel) {
    this.degreeLevel = degreeLevel;
  }
  
}
