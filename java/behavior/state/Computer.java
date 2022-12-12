package behavior.state;

import behavior.state.power.Off;
import behavior.state.power.PowerState;

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
