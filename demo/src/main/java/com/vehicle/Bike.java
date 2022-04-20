package com.vehicle;

public class Bike extends Vehicle {
  
  private int wheeliePower;

  public Bike(int numberOfWheels, String engine, int wheeliePower) {
    super(numberOfWheels, engine);
    this.wheeliePower = wheeliePower;
  }

  public int getWheeliePower() {
    return wheeliePower;
  }

  public void setWheeliePower(int wheeliePower) {
    this.wheeliePower = wheeliePower;
  }
  
}
