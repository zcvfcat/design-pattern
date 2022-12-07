package behavioral.command;

import behavioral.command.light.Light;
import behavioral.command.light.Switch;
import behavioral.command.light.TurnOffLightCommand;
import behavioral.command.light.TurnOnLightCommand;

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
