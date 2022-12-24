package creation.prototype;

import creation.prototype.framework.Product;

public class UnderlinPen implements Product {
  private char ulchar;

  public UnderlinPen(char ulchar) {
    this.ulchar = ulchar;
  }

  @Override
  public void use(String s) {
    int ulen = s.length();
    System.out.println(s);
    for (int i = 0; i < ulen; i++) {
      System.out.print(ulchar);
    }
    System.out.println();
  }

  @Override
  public Product createCopy() {
    Product p = null;

    try {
      p = (Product) clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return p;
  }

}
