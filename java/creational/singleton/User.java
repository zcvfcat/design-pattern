package creational.singleton;

public class User {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    System.out.println(singleton1.hashCode() == singleton2.hashCode());
  }
}
