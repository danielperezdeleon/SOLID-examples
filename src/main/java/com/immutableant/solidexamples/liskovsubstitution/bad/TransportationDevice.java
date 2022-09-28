package com.immutableant.solidexamples.liskovsubstitution.bad;

abstract class TransportationDevice
{
  String name;
  double speed;
  Engine engine;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  void startEngine() {

  }


}
