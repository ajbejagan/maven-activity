package com.vehicle;

public class Vehicle {

  private int numberOfWheels;
  private String engine;
  // activity 2
  private double gas;
  private double gasConsumption;
  private String vehicleName;

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

  public double getGas() {
    return gas;
  }

  public void setGas(double gas) {
    this.gas = gas;
  }

  public double getGasConsumption() {
    return gasConsumption;
  }

  public void setGasConsumption(double gasConsumption) {
    this.gasConsumption = gasConsumption;
  }

  public String getVehicleName() {
    return vehicleName;
  }

  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

}
