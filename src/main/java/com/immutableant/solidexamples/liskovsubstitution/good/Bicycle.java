package com.immutableant.solidexamples.liskovsubstitution.good;

public class Bicycle extends
    DevicesWithoutEngines {

  @Override
  void startMoving() {
    System.out.println("Peddling intensifies");
  }


}
