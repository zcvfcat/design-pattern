package structure.bridge.avatars;

import structure.bridge.Weapon;
import structure.bridge.WeaponHandler;

public class Elf implements WeaponHandler {
  private Weapon weapon;

  public Elf(Weapon weapon) {
    this.weapon = weapon;
  }

  @Override
  public void handle() {
    weapon.attack();
  }
}
