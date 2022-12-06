package behavioral.memento.game;

public class Originator {
  private String state;

  public void setState(String state) {
    this.state = state;
  }

  public Memento saveState() {
    return new Memento(this.state);
  }

  public void restore(Memento memento) {
    this.state = memento.getState();
  }

  public void printState() {
    System.out.println("현재 상태값 : " + this.state);
  }
}
