package behavioral.command.light;

import behavioral.command.Command;

public class TurnOnLightCommand implements Command {
  private Light theLight;

  public TurnOnLightCommand(Light light) {
    this.theLight = light;
  }

  public void execute() {
    theLight.turnOn();
  }
}