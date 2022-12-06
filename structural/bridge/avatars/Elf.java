package structural.bridge.avatars;

import structural.bridge.Weapon;
import structural.bridge.WeaponHandler;

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
