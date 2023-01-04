package behavior.chainofresponsiblity.prev;

import behavior.chainofresponsiblity.prev.processors.NegativeProcessor;
import behavior.chainofresponsiblity.prev.processors.PositiveProcessor;
import behavior.chainofresponsiblity.prev.processors.ZeroProcessor;

public class Chain<T> {
  final Processor<T> chain;

  public Chain() {
    this.chain = new NegativeProcessor<T>(new ZeroProcessor<T>(new PositiveProcessor<T>(null)));
  }

  public void process(T request) {
    this.chain.process(request);
  }
}
