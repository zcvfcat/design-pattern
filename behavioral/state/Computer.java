package behavioral.state;

import behavioral.state.power.Off;
import behavioral.state.power.PowerState;

public class Computer {
  private PowerState powerState;

  public Computer() {
    this.powerState = new Off();
  }

  public void setPowerState(PowerState powerState) {
    this.powerState = powerState;
  }

  public void powerPush() {
    powerState.powerPush();
  }
}
