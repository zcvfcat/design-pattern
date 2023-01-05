package behavior.observer.prev;

public interface Publisher {
  void add(Observer observer);

  void delete(Observer observer);

  void notifies();
}
