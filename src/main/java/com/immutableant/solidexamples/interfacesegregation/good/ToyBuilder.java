package com.immutableant.solidexamples.interfacesegregation.good;

public class ToyBuilder {
  public static ToyHouse buildToyHouse(){
    ToyHouse toyHouse = new ToyHouse();
    toyHouse.setPrice(15.00);
    toyHouse.setColor("green");
    return toyHouse;
  }

  public static ToyCar buildToyCar(){
    ToyCar toyCar = new ToyCar();
    toyCar.setPrice(15.00);
    toyCar.setColor("green");
    toyCar.move();
    return toyCar;
  }

  public static ToyPlane buildToyPlane(){
    ToyPlane toyPlane = new ToyPlane();
    toyPlane.setPrice(15.00);
    toyPlane.setColor("green");
    toyPlane.move();
    toyPlane.fly();
    return toyPlane;
  }

}
