package creational.prototype;

import creational.prototype.car.ModelX;
import creational.prototype.car.ModelY;
import creational.prototype.car.TeslaPrototype;

public class User {
  public static void main(String[] args) {
    TeslaPrototype modelX = new ModelX();
    TeslaPrototype modelY = new ModelY();
  }
}
