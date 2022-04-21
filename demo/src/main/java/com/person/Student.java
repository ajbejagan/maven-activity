package com.person;

public class Student extends Person {
  
  private String year;

  public Student(String firstName, String lastName, int age, String location, String year) {
    super(firstName, lastName, age, location);
    this.year = year;
  }

  public Student(String firstName, String lastName, int age, String year) {
    super(firstName, lastName, age);
    this.year = year;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

}
