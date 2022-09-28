package com.immutableant.solidexamples.liskovsubstitution.bad;

public class Car extends TransportationDevice {
  @Override
  void startEngine() {
    System.out.println("Vrooooom!");
  }
}
