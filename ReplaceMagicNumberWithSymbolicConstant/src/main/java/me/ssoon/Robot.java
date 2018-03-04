package me.ssoon;

public class Robot {

  public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
  public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
  public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");
  private final String name;

  public Robot(final String name) {
    this.name = name;
  }

  public void order(final RobotCommand command) {
    if (command == COMMAND_WALK) {
      System.out.println(name + " walks.");
    } else if (command == COMMAND_STOP) {
      System.out.println(name + " stops.");
    } else if (command == COMMAND_JUMP) {
      System.out.println(name + " jumps.");
    } else {
      System.out.println("Command error. command = " + command);
    }
  }
}
