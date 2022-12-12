package behavior.command.light;

import behavior.command.Command;

public class Switch {
  private final Command turnOnCommand;
  private final Command turnOffCommand;

  public Switch(Command turnOnCommand, Command turnOffCommand) {
    this.turnOnCommand = turnOnCommand;
    this.turnOffCommand = turnOffCommand;
  }

  public void turnOn() {
    this.turnOnCommand.execute();
  }

  public void turnOff() {
    this.turnOffCommand.execute();
  }
}
