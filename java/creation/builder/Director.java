package creation.builder;

public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.makeTitle("Greeting");
    builder.makeTitle("일반적인 인사");
    builder.makeItems(new String[] {
        "How are you?",
        "Hello.",
        "Hi.",
    });
    builder.makeString("시간대별 인사");
    builder.makeItems(new String[] {
        "Good morning",
        "Good afternoon",
        "Good evening"
    });
    builder.close();
  }
}
