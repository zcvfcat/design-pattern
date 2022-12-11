package behavioral.state.power;

public class Off implements PowerState {

  @Override
  public void powerPush() {
    System.out.println("전원 off");
  }
}
