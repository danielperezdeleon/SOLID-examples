package com.immutableant.solidexamples.dependencyinversion.good;

import org.junit.jupiter.api.Test;

class ElectricPowerSwitchTest {

  @Test
  void press() {
    Switchable switchableBulb = new LightBulb();
    Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
    bulbPowerSwitch.press();
    bulbPowerSwitch.press();

    Switchable switchableFan = new Fan();
    Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
    fanPowerSwitch.press();
    fanPowerSwitch.press();
  }
}