package com.immutableant.solidexamples.singleresponsability.better;

import org.springframework.stereotype.Controller;

@Controller
public class Printer {

  Text text;

  Printer(Text text) {
    this.text = text;
  }

  /*method for formatting output*/
  void printText() {
    System.out.println(text.getText());
  }

}
