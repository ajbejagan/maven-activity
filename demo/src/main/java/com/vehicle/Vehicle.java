package com.vehicle;

public class Vehicle {

  private int numberOfWheels;
  private String engine;

  public Vehicle(int numberOfWheels, String engine) {
    this.numberOfWheels = numberOfWheels;
    this.engine = engine;
  }

  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

}
