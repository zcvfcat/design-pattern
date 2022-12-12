package behavior.strategy;

import behavior.strategy.weapons.Gun;
import behavior.strategy.weapons.Sword;

public class User {
  public static void main(String[] args) {
    final Avatar avatar = new Avatar();
    avatar.attack();

    avatar.setWeapon(new Sword());
    avatar.attack();

    avatar.setWeapon(new Gun());
    avatar.attack();

    // avatar.setWeapon(new Weapon() {
    // @Override
    // public void attack() {
    // System.out.println("이렇게는 쓰지마...");
    // }
    // });
    // avatar.attack();
  }
}
