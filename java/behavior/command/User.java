package behavior.command;

import behavior.command.light.Light;
import behavior.command.light.Switch;
import behavior.command.light.TurnOffLightCommand;
import behavior.command.light.TurnOnLightCommand;

public class User {
  public static void main(String[] args) {
    Light light = new Light();
    Command switchUp = new TurnOnLightCommand(light);
    Command switchDown = new TurnOffLightCommand(light);

    Switch s = new Switch(switchUp, switchDown);

    s.turnOn();
    s.turnOff();
  }
}
