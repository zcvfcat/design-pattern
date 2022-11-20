package creational.factory.method;

import creational.factory.method.product.AProduct;
import creational.factory.method.product.BProduct;
import creational.factory.method.product.IProduct;

public class Factory {

  public IProduct createProduct(String name) {
    if (name.equalsIgnoreCase("a")) {
      return new AProduct();
    } else if (name.equalsIgnoreCase("b")) {
      return new BProduct();
    } else {
      return new IProduct() {
        public String name = "None";
        public Integer pay = 0;
      };
    }
  }

}
