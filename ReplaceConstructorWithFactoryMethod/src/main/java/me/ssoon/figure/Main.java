package me.ssoon.figure;

public class Main {

  public static void main(String[] args) {
    final Shape line = new Shape(Shape.TYPECODE_LINE, 0, 0, 100, 200);
    final Shape rectangle = new Shape(Shape.TYPECODE_RECTANGLE, 10, 20, 30, 40);
    final Shape oval = new Shape(Shape.TYPECODE_OVAL, 100, 200, 300, 400);

    final Shape[] shape = {
        line, rectangle, oval
    };

    for (final Shape s : shape) {
      s.draw();
    }
  }
}