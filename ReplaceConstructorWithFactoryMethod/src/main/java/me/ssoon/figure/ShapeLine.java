package me.ssoon.figure;

public class ShapeLine extends Shape {

  public ShapeLine(final int startX, final int startY, final int endX, final int endY) {
    super(startX, startY, endX, endY);
  }

  @Override
  public String getName() {
    return "LINE";
  }

  @Override
  public void draw() {
    System.out.println("drawLine: " + this.toString());
  }
}
