package com.immutableant.solidexamples.singleresponsability.better;

import org.springframework.stereotype.Component;

@Component
public class Text {

  String text;
  String author;
  int length;

  @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
  public Text(String text, String author) {
    this.text = text;
    this.author = author;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  /*methods that change the text*/
  void allLettersToUpperCase() {
    setText(getText().toUpperCase());
  }

  void findSubTextAndDelete(String text) {
    setText(getText().replace(text, ""));
  }

}
