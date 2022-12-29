package creation.abstractfactory.prev.product;

public interface IProduct {
  public String name = "None";
  public Integer pay = 0;

  public default String getName() {
    return name;
  }

  public default Integer getPay() {
    return pay;
  }
}
