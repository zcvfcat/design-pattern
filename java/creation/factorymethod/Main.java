package creation.factorymethod;

import creation.factorymethod.framework.Factory;
import creation.factorymethod.framework.Product;
import creation.factorymethod.idcard.IDCardFactory;

public class Main {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("Kim");
    Product card2 = factory.create("Min");
    Product card3 = factory.create("Su");

    card1.use();
    card2.use();
    card3.use();
  }
}
