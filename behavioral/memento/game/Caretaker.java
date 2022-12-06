package behavioral.memento.game;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
  final List<Memento> mementos = new ArrayList<>();

  public void execute() {
    Originator originator = new Originator();
    originator.setState("State1");
    originator.setState("State2");
    originator.printState();

    mementos.add(originator.saveState());
    originator.setState("State3");
    originator.printState();

    mementos.add(originator.saveState());
    originator.setState("State4");
    originator.printState();

    originator.restore(mementos.get(0));
    originator.printState();
  }
}
