package com.immutableant.solidexamples.liskovsubstitution.bad;

public class Bicycle extends TransportationDevice{

  @Override
  void startEngine() {
    System.out.println("Wait, what?");
  }
}
