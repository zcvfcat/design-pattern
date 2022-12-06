package structural.memento;

import structural.memento.game.Caretaker;

public class User {
  public static void main(String[] args) {
    Caretaker game = new Caretaker();
    game.execute();
  }
}
