package me.ssoon.exsmell;

public class Client {

  private final Printer printer;

  public Client(final boolean graphical) {
    printer = Printer.create(graphical);
  }

  public void execute() {
    final int[] table = {3, 1, 4, 1, 5, 9};
    for (final int n : table) {
      printer.println(n);
    }
  }
}
