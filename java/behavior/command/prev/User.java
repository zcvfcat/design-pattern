package prev;

import prev.light.Light;
import prev.light.Switch;
import prev.light.TurnOffLightCommand;
import prev.light.TurnOnLightCommand;

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
