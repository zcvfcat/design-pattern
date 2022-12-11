package structural.bridge.weapons;

import structural.bridge.Weapon;

public class Bow implements Weapon {

  @Override
  public void attack() {
    System.out.println("shot");
  }
}
