package me.ssoon.figure;

public class ShapeRectangle extends Shape {

  public ShapeRectangle(final int startX, final int startY, final int endX, final int endY) {
    super(startX, startY, endX, endY);
  }

  @Override
  public String getName() {
    return "RECTANGLE";
  }

  @Override
  public void draw() {
    System.out.println("drawRectangle: " + this.toString());
  }
}
