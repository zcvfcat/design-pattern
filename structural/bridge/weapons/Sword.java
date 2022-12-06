package structural.bridge.weapons;

import structural.bridge.Weapon;

public class Sword implements Weapon {

  @Override
  public void attack() {
    System.out.println("slice");
  }

}
