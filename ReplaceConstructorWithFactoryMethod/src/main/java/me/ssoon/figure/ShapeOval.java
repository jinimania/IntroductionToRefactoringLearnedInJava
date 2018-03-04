package me.ssoon.figure;

public class ShapeOval extends Shape {

  protected ShapeOval(final int startX, final int startY, final int endX, final int endY) {
    super(startX, startY, endX, endY);
  }

  @Override
  public String getName() {
    return "OVAL";
  }

  @Override
  public void draw() {
    System.out.println("drawOval: " + this.toString());
  }
}
