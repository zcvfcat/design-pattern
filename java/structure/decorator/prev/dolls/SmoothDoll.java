package structure.decorator.prev.dolls;

public class SmoothDoll extends DecorateDoll {

  public SmoothDoll(Doll doll) {
    super(doll);
  }

  @Override
  public String decorate() {
    return super.decorate() + " + Smooth";
  }

}
