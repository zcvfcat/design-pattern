package structural.facade;

public class User {
  public static void main(String[] args) {
    Computer facade = new Computer();
		facade.startComputer();
  }
}
