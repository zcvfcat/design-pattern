package creation.prototype.framework;

public interface Product extends Cloneable { // Cloneable <- 마커 인터페이스
  public abstract void use(String s);

  public abstract Product createCopy();
}
