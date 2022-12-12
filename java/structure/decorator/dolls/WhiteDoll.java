package structure.decorator.dolls;

public class WhiteDoll extends DecorateDoll {

  public WhiteDoll(Doll doll) {
    super(doll);
  }

  @Override
  public String decorate() {
    return super.decorate() + " + White";
  }

}
