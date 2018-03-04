package me.ssoon;

public class Robot {

  private final String name;

  public Robot(final String name) {
    this.name = name;
  }

  public void order(final int command) {
    if (command == 0) {
      System.out.println(name + " walks.");
    } else if (command == 1) {
      System.out.println(name + " stops.");
    } else if (command == 2) {
      System.out.println(name + " jumps.");
    } else {
      System.out.println("Command error. command = " + command);
    }
  }
}
