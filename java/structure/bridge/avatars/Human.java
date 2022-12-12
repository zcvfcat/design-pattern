package structure.bridge.avatars;

import structure.bridge.Weapon;
import structure.bridge.WeaponHandler;

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
