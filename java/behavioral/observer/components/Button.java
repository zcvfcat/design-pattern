package behavioral.observer.components;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.Observer;
import behavioral.observer.Publisher;

public class Button implements Publisher {
  final List<Observer> observers = new ArrayList<>();

  @Override
  public void add(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void delete(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifies() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

}
