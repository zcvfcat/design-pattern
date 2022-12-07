package behavioral.chainofresponsiblity;

import behavioral.chainofresponsiblity.processors.NegativeProcessor;
import behavioral.chainofresponsiblity.processors.PositiveProcessor;
import behavioral.chainofresponsiblity.processors.ZeroProcessor;

public class Chain<T> {
  final Processor<T> chain;

  public Chain() {
    this.chain = new NegativeProcessor<T>(new ZeroProcessor<T>(new PositiveProcessor<T>(null)));
  }

  public void process(T request) {
    this.chain.process(request);
  }
}
