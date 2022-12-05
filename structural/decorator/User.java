package structural.decorator;

import structural.decorator.dolls.BlackDoll;
import structural.decorator.dolls.Doll;
import structural.decorator.dolls.SmoothDoll;
import structural.decorator.dolls.WhiteDoll;

public class User {
  public static void main(String[] args) {
    Doll doll1 = new RussiaDoll();
    Doll doll2 = new BlackDoll(new RussiaDoll());
    Doll doll3 = new SmoothDoll(new WhiteDoll(new RussiaDoll()));
    Doll doll4 = new BlackDoll(new WhiteDoll(new SmoothDoll(new RussiaDoll())));


    System.out.println(doll1.decorate());
    System.out.println(doll2.decorate());
    System.out.println(doll3.decorate());
    System.out.println(doll4.decorate());
  }
}
