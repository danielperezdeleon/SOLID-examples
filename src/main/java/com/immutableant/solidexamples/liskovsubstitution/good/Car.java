package com.immutableant.solidexamples.liskovsubstitution.good;

public class Car extends DevicesWithEngines {

  @Override
  void startEngine() {
    System.out.println("tkkkkk..Vrooooom!");
  }
}
