package com.person;

public class Student extends Person {
  
  private String year;

  public Student(String firstname, String lastname, int age, String location, String year) {
    super(firstname, lastname, age, location);
    this.year = year;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

}
