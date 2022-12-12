package creation.abstractfactory.product;

public class HermesProduct implements IProduct {
  public String name = "B";
  public Integer pay = 200;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Integer getPay() {
    return pay;
  }
}
