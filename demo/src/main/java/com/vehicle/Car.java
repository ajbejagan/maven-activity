package com.vehicle;

public class Car extends Vehicle {

  private int storageCapacity;

  public Car(int numberOfWheels, String engine, int storageCapacity) {
    super(numberOfWheels, engine);
    this.storageCapacity = storageCapacity;
  }

  public int getStorageCapacity() {
    return storageCapacity;
  }

  public void setStorageCapacity(int storageCapacity) {
    this.storageCapacity = storageCapacity;
  }
  
}
