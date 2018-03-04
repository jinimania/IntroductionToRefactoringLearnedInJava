package me.ssoon.figure;

public class Shape {

  public static final int TYPECODE_LINE = 0;
  public static final int TYPECODE_RECTANGLE = 1;
  public static final int TYPECODE_OVAL = 2;

  private final int typeCode;
  private final int startX;
  private final int startY;
  private final int endX;
  private final int endY;

  public Shape(final int typeCode, final int startX, final int startY, final int endX,
      final int endY) {
    this.typeCode = typeCode;
    this.startX = startX;
    this.startY = startY;
    this.endX = endX;
    this.endY = endY;
  }

  public int getTypeCode() {
    return typeCode;
  }

  public String getName() {
    switch (typeCode) {
      case TYPECODE_LINE:
        return "LINE";
      case TYPECODE_RECTANGLE:
        return "RECTANGLE";
      case TYPECODE_OVAL:
        return "OVAL";
      default:
        return null;
    }
  }

  @Override
  public String toString() {
    return "[ " +
        getName() + ", " +
        "(" + startX + ", " + startY + ")-" +
        "(" + endX + ", " + endY + ") ]";
  }

  public void draw() {
    switch (typeCode) {
      case TYPECODE_LINE:
        drawLine();
        break;
      case TYPECODE_RECTANGLE:
        drawRectangle();
        break;
      case TYPECODE_OVAL:
        drawOval();
        break;
      default:
    }
  }

  private void drawLine() {
    System.out.println("drawLine: " + this.toString());
  }

  private void drawRectangle() {
    System.out.println("drawRectangle: " + this.toString());
  }

  private void drawOval() {
    System.out.println("drawOval: " + this.toString());
  }
}