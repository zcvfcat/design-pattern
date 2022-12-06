package behavioral.memento;

import behavioral.memento.game.Caretaker;

public class User {
  public static void main(String[] args) {
    Caretaker life = new Caretaker();
    life.execute();
  }
}
