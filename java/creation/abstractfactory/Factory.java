package creation.abstractfactory;

import creation.abstractfactory.product.GucciProduct;
import creation.abstractfactory.product.HermesProduct;
import creation.abstractfactory.product.IProduct;

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
