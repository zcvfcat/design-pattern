package structure.bridge;

import structure.bridge.avatars.Elf;
import structure.bridge.avatars.Human;
import structure.bridge.weapons.Bow;
import structure.bridge.weapons.Sword;

public class User {
  public static void main(String[] args) {
    final Human human = new Human(new Sword());
    final Elf elf = new Elf(new Bow());

    human.handle();
    elf.handle();
  }
}
