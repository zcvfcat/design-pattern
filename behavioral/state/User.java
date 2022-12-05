package behavioral.state;

import behavioral.state.power.Off;
import behavioral.state.power.On;
import behavioral.state.power.Saving;

public class User {
  public static void main(String[] args) {
    Computer computer = new Computer();
    On on = new On();
    Off off = new Off();
    Saving saving = new Saving();

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
