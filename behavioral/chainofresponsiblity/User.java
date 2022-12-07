package behavioral.chainofresponsiblity;

public class User {
  public static void main(String[] args) {
    Chain<Integer> chain = new Chain<>();

    chain.process(90);
    chain.process(-50);
    chain.process(0);
    chain.process(91);
  }
}
