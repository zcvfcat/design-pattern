package behavior.state.power;

public class Saving implements PowerState {

  private static PowerState singleton = new Saving();

  private Saving() {
  }

  public static PowerState getSingleton() {
    return singleton;
  }

  @Override
  public void powerPush() {
    System.out.println("절전 모드");
  }
}
