package behavioral.state;

import behavioral.state.power.Off;
import behavioral.state.power.On;
import behavioral.state.power.Saving;

public class User {
  public static void main(String[] args) {
    final Computer computer = new Computer();
    final On on = new On();
    final Off off = new Off();
    final Saving saving = new Saving();

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
