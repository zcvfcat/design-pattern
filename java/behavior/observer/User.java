package behavior.observer;

import behavior.observer.components.Button;

public class User {
  public static void main(String[] args) {
    final Button button = new Button();
    final Observer observer = new Observer() {
      @Override
      public void update() {
        System.out.println(this.hashCode());
      }
    };

    button.add(observer);

    button.add(new Observer() {
      @Override
      public void update() {
        System.out.println(this.hashCode());
      }
    });

    button.notifies();
    button.delete(observer);
    button.notifies();
    System.out.println(observer.hashCode());
  }
}
