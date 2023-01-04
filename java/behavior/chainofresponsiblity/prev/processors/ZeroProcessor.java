package behavior.chainofresponsiblity.prev.processors;

import behavior.chainofresponsiblity.prev.Processor;

public class ZeroProcessor<Integer> extends Processor<Integer> {
  public ZeroProcessor(Processor<Integer> nextProcessor) {
    super(nextProcessor);
  }

  @Override
  public void process(Integer request) {
    if ((int) request == 0) {
      System.out.println("ZeroProcessor");
    } else {
      super.process(request);
    }
  }
}
