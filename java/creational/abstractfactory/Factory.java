package creational.abstractfactory;

import creational.abstractfactory.product.GucciProduct;
import creational.abstractfactory.product.HermesProduct;
import creational.abstractfactory.product.IProduct;

public class Factory {

  public IProduct createProduct(String name) {
    if (name.equalsIgnoreCase("Gucci")) {
      return new GucciProduct();
    } else if (name.equalsIgnoreCase("Hermes")) {
      return new HermesProduct();
    } else {
      throw new IllegalArgumentException("not product");
    }
  }
}
