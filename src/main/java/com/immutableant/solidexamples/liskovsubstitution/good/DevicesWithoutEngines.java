package com.immutableant.solidexamples.liskovsubstitution.good;

public class DevicesWithoutEngines extends TransportationDevice {

  void startMoving() {
    System.out.println("Move");
  }

}
