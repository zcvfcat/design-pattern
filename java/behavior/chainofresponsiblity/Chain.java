package behavior.chainofresponsiblity;

import behavior.chainofresponsiblity.processors.NegativeProcessor;
import behavior.chainofresponsiblity.processors.PositiveProcessor;
import behavior.chainofresponsiblity.processors.ZeroProcessor;

public class Chain<T> {
  final Processor<T> chain;

  public Chain() {
    this.chain = new NegativeProcessor<T>(new ZeroProcessor<T>(new PositiveProcessor<T>(null)));
  }

  public void process(T request) {
    this.chain.process(request);
  }
}
