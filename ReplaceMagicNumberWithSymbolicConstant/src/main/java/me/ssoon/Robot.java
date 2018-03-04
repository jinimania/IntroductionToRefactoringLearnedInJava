package me.ssoon;

public class Robot {

  public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
  public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
  public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");
  private final String name;

  public enum Command {
    WALK,
    STOP,
    JUMP
  }

  public Robot(final String name) {
    this.name = name;
  }

  public void order(final Robot.Command command) {
    if (command == Command.WALK) {
      System.out.println(name + " walks.");
    } else if (command == Command.STOP) {
      System.out.println(name + " stops.");
    } else if (command == Command.JUMP) {
      System.out.println(name + " jumps.");
    } else {
      System.out.println("Command error. command = " + command);
    }
  }
}
