package behavior.state.power;

public class On implements PowerState {

  private static PowerState singleton = new On();

  private On() {
  }

  public static PowerState getSingleton() {
    return singleton;
  }

  @Override
  public void powerPush() {
    System.out.println("전원 on");
  }
}
