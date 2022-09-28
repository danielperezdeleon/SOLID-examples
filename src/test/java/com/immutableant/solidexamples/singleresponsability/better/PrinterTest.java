package com.immutableant.solidexamples.singleresponsability.better;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrinterTest {

  private Printer controller;

  @BeforeEach
  void setUp() {
    Text text = new Text("test text", "this guy");
    controller = new Printer(text);
  }

  @Test
  void printText() {
    controller.printText();
  }
}