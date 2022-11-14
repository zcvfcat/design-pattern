package creational.singleton;

public class Singleton {

  private static Singleton instance = null;

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (instance == null) {
      Singleton.instance = new Singleton();
    }
    return instance;
  }
}