package behavior.state;

import behavior.state.power.Off;
import behavior.state.power.On;
import behavior.state.power.PowerState;
import behavior.state.power.Saving;

public class User {
  public static void main(String[] args) {
    final Computer computer = new Computer();
    final PowerState on = On.getSingleton();
    final PowerState off = Off.getSingleton();
    final PowerState saving = Saving.getSingleton();

    computer.setPowerState(on);
    computer.powerPush();

    computer.setPowerState(saving);
    computer.powerPush();

    computer.setPowerState(off);
    computer.powerPush();

    computer.setPowerState(on);
    computer.powerPush();
  }
}
