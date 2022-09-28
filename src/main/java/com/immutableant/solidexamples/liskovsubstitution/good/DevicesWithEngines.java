package com.immutableant.solidexamples.liskovsubstitution.good;

public abstract class DevicesWithEngines extends TransportationDevice {

  Engine engine;

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  void startEngine() {
    System.out.println("Vroooooom!");
  }

  ;

}
