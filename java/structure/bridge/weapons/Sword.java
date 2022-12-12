package structure.bridge.weapons;

import structure.bridge.Weapon;

public class Sword implements Weapon {

  @Override
  public void attack() {
    System.out.println("slice");
  }

}
