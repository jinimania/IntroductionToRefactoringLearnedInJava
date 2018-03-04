package me.ssoon.exsmell;

public class GraphPrinter extends Printer {

  public void println(final int n) {
    for (int i = 0; i < n; i++) {
      System.out.println("*");
    }
    System.out.printf("  (%d)", n);
    System.out.println();
  }
}
