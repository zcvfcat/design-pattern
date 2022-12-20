package structure.adapter.delegate;

public class PrintBanner implements Print {
  private Banner banner;

  public PrintBanner(String string) {
    this.banner = new Banner(string);
  }

  @Override
  public void printWeak() {
    this.banner.showWithParen();
  }

  @Override
  public void printStrong() {
    this.banner.showWithAster();
  }

}
