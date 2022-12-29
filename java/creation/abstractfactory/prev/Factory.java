package creation.abstractfactory.prev;

import creation.abstractfactory.prev.product.GucciProduct;
import creation.abstractfactory.prev.product.HermesProduct;
import creation.abstractfactory.prev.product.IProduct;

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
