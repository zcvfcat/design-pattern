package behavior.strategy.weapons;

public class Sword implements Weapon {

  @Override
  public void attack() {
    System.out.println("slice");
  }
}
