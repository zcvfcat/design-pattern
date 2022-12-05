package creational.abstractfactory;

import java.text.MessageFormat;

import creational.abstractfactory.product.IProduct;

public class User {
  public static void main(String[] args) {
    final Factory factory = new Factory();

    IProduct gucci = factory.createProduct("Gucci");
    IProduct hermes = factory.createProduct("Hermes");

    System.out.println("name : " + gucci.getName() + ", pay: " + gucci.getPay());
    System.out.println("name : " + hermes.getName() + ", pay: " + hermes.getPay());
  }
}
