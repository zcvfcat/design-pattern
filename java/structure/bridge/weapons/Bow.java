package structure.bridge.weapons;

import structure.bridge.Weapon;

public class Bow implements Weapon {

  @Override
  public void attack() {
    System.out.println("shot");
  }
}
