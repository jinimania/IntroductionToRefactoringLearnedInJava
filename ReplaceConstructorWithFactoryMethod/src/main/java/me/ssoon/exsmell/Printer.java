package me.ssoon.exsmell;

public abstract class Printer {

  public static Printer create(final boolean graphical) {
    if (graphical) {
      return new GraphPrinter();
    } else {
      return new DigitPrinter();
    }
  }

  public abstract void println(final int n);
}
