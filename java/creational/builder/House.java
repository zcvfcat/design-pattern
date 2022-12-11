package creational.builder;

public class House {
  public String title;
  public int room;
  public double size;

  public House(String title, int room, double size) {
    this.title = title;
    this.room = room;
    this.size = size;
  }

  public static class Builder {
    String title = "";
    int room = 2;
    double size = 30d;

    public Builder() {
    }

    public Builder setRoom(int number) {
      this.room = number;
      return this;
    }

    public Builder setTitle(String name) {
      this.title = name;
      return this;
    }

    public Builder setSize(double size) {
      this.size = size;
      return this;
    }

    public House build() {
      return new House(this.title, this.room, this.size);
    }
  }
}
