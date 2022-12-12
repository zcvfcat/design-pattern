package structure.decorator.dolls;

public class BlackDoll extends DecorateDoll {

  public BlackDoll(Doll skin) {
    super(skin);
  }

  @Override
  public String decorate() {
    return super.decorate() + " + Black";
  }

}
