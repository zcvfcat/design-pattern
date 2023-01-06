package behavior.state.prev;

import behavior.state.prev.power.Off;
import behavior.state.prev.power.PowerState;

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
