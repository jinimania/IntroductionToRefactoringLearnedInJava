package me.ssoon;

public class RobotCommand {

  private final String name;

  public RobotCommand(final String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "RobotCommand{" +
        "name='" + name + '\'' +
        '}';
  }
}
