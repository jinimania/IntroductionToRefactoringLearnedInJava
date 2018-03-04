package me.ssoon.figure;

public abstract class Shape {

  private final int startX;
  private final int startY;
  private final int endX;
  private final int endY;

  protected Shape(final int startX, final int startY, final int endX, final int endY) {
    this.startX = startX;
    this.startY = startY;
    this.endX = endX;
    this.endY = endY;
  }

  public static Shape createLine(final int startX, final int startY, final int endX,
      final int endY) {
    return new ShapeLine(startX, startY, endX, endY);
  }

  public static Shape createRectangle(final int startX, final int startY, final int endX,
      final int endY) {
    return new ShapeRectangle(startX, startY, endX, endY);
  }

  public static Shape createOval(final int startX, final int startY, final int endX,
      final int endY) {
    return new ShapeOval(startX, startY, endX, endY);
  }

  @Override
  public String toString() {
    return "[ " +
        getName() + ", " +
        "(" + startX + ", " + startY + ")-" +
        "(" + endX + ", " + endY + ") ]";
  }

  public abstract String getName();

  public abstract void draw();
}
