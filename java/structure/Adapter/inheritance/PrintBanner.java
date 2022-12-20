package structure.adapter.inheritance;

public class PrintBanner extends Banner implements Print {

  public PrintBanner(String string) {
    super(string);
  }

  @Override
  public void printWeak() {
    this.showWithParen();
  }

  @Override
  public void printStrong() {
    this.showWithAster();
  }

}
