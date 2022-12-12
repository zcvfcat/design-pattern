package behavior.strategy.weapons;

public class Gun implements Weapon {

  @Override
  public void attack() {
    System.out.println("shot");
  }
}
