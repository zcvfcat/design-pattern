package structural.bridge.avatars;

import structural.bridge.Weapon;
import structural.bridge.WeaponHandler;

public class Human implements WeaponHandler {
  private Weapon weapon;

  public Human(Weapon weapon) {
    this.weapon = weapon;
  }

  @Override
  public void handle() {
    weapon.attack();
  }

}
