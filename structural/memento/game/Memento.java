package structural.memento.game;

public class Memento {
  private final String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return this.state;
  }
}
