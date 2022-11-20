package creational.factory.method;

import java.text.MessageFormat;

import creational.factory.method.product.IProduct;

public class User {
  public static void main(String[] args) {
    Factory factory = new Factory();

    IProduct a = factory.createProduct("a");
    IProduct b = factory.createProduct("b");
    IProduct i = factory.createProduct("default");

    System.out.println("name : " + a.getName() + ", pay: " + a.getPay());
    System.out.println("name : " + b.getName() + ", pay: " + b.getPay());
    System.out.println("name : " + i.getName() + ", pay: " + i.getPay());
  }
}
