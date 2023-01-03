package structure.decorator.prev.dolls;

public abstract class DecorateDoll implements Doll {
  Doll doll;

  public DecorateDoll(Doll doll) {
    this.doll = doll;
  }

  @Override
  public String decorate() {
    return this.doll.decorate();
  }
}
