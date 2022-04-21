package com.person;

import java.util.Scanner;
import com.vehicle.*;

public class Person {

  private String firstName;
  private String lastName;
  private int age;
  // activity 2
  private String location;
  private String travelVehicle = "";

  public Person(String firstName, String lastName, int age, String location) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.location = location;
  }

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public void travel(Vehicle vehicle) {
    Scanner sc = new Scanner(System.in);
    // Print → The person (first name last name) is currently in (current location)
    System.out.println(this.firstName + " " + this.lastName + " is currently in " + this.location);
    // Ask for input -> the location that the person wants to travel to
    System.out.println("Enter target destination: ");
    String destination = sc.nextLine();
    // Ask for input -> Distance
    System.out.println("Enter estimated distance from " + this.location + " to " + destination);
    double distance = sc.nextDouble();
    // Set the person’s location to the new location
    this.location = destination;
    // Set the travel_vehicle to the name of the Vehicle used
    this.travelVehicle = vehicle.getVehicleName();
    // Deduct the vehicle’s gas with the gas used.
    double remainingGas = calculateRemainingGas(vehicle, distance);
    vehicle.setGas(remainingGas);
    // Print → The person (first name last name) tavelled to (new location) using (vehicle_name)
    System.out.println(this.firstName + " " + this.lastName + " travelled to " + this.location + " using " + this.travelVehicle);
    sc.close();
  }

  public double calculateRemainingGas(Vehicle vehicle, double distance) {
    double gasUsed = distance / vehicle.getGasConsumption();
    double remainingGas = vehicle.getGas() - gasUsed;
    return remainingGas;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }  

}