package behavior.state.power;

public class Saving implements PowerState {

  @Override
  public void powerPush() {
    System.out.println("절전 모드");
  }
}
