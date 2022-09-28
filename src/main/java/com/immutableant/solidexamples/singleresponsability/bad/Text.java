package com.immutableant.solidexamples.singleresponsability.bad;

public class Text {
  String text;
  String author;
  int lenght;

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

  public int getLenght() {
    return lenght;
  }

  public void setLenght(int lenght) {
    this.lenght = lenght;
  }

  /*methods that change the text*/
  void allLettersToUpperCase() {
    setText(getText().toUpperCase());
  }

  void findSubTextAndDelete(String text) {
    setText(getText().replace(text, ""));
  }

  /*method for formatting output*/
  void printText() {
    System.out.println(getText());
  }

}
