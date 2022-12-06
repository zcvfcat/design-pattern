package structural.bridge;

import structural.bridge.avatars.Elf;
import structural.bridge.avatars.Human;
import structural.bridge.weapons.Bow;
import structural.bridge.weapons.Sword;

public class User {
  public static void main(String[] args) {
    final Human human = new Human(new Sword());
    final Elf elf = new Elf(new Bow());

    human.handle();
    elf.handle();
  }
}
