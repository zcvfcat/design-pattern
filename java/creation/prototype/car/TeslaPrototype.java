package creation.prototype.car;

public class TeslaPrototype implements Cloneable {
  public int height;
  public int width;
  public String color;

  public TeslaPrototype() {
    super();
  }

  public TeslaPrototype(TeslaPrototype prototype) {
    if (prototype != null) {
      this.height = prototype.height;
      this.width = prototype.width;
      this.color = prototype.color;
    }
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    TeslaPrototype clone = null;

    try {
      clone = (TeslaPrototype) super.clone();
    } catch (RuntimeException e) {
      e.printStackTrace();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    return clone;
  }

}
