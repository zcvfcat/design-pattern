package creational.factory.method.product;

public class BProduct implements IProduct {
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
