package behavioral.command;

import behavioral.command.lightswitch.Light;
import behavioral.command.lightswitch.Switch;
import behavioral.command.lightswitch.TurnOffLightCommand;
import behavioral.command.lightswitch.TurnOnLightCommand;

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
