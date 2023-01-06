package prev.light;

import prev.Command;

public class TurnOffLightCommand implements Command {
  private Light theLight;

  public TurnOffLightCommand(Light light) {
    this.theLight = light;
  }

  public void execute() {
    theLight.turnOff();
  }
}