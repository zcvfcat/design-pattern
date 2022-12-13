package structure.flyweight;

import structure.flyweight.component.FontFactory;
import structure.flyweight.component.Character;

public class User {

  public static void main(String[] args) {
    FontFactory fontFactory = new FontFactory();
    Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
    Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
    Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));
    Character c4 = new Character('l', "white", fontFactory.getFont("nanum:12"));
    Character c5 = new Character('o', "white", fontFactory.getFont("nanum:12"));
  }
}
