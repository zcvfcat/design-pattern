package creational.factory.method.product;

public class AProduct implements IProduct {
  public String name = "a";
  public Integer pay = 100;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Integer getPay() {
    return pay;
  }
}
