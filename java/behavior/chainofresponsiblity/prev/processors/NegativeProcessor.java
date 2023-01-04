package behavior.chainofresponsiblity.prev.processors;

import behavior.chainofresponsiblity.prev.Processor;

public class NegativeProcessor<Integer> extends Processor<Integer> {
  public NegativeProcessor(Processor<Integer> nextProcessor) {
    super(nextProcessor);
  }

  @Override
  public void process(Integer request) {
    if ((int) request < 0) {
      System.out.println("NegativeProcessor");
    } else {
      super.process(request);
    }
  }
}
