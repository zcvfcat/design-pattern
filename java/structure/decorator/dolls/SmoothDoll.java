package structure.decorator.dolls;

public class SmoothDoll extends DecorateDoll {

  public SmoothDoll(Doll doll) {
    super(doll);
  }

  @Override
  public String decorate() {
    return super.decorate() + " + Smooth";
  }

}
