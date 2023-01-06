package behavior.state.power;

public class Off implements PowerState {

  private static PowerState singleton = new Off();

  private Off() {

  }

  public static PowerState getSingleton() {
    return singleton;
  }

  @Override
  public void powerPush() {
    System.out.println("전원 off");
  }
}
