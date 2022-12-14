package behavior.chainofresponsiblity.prev.processors;

import behavior.chainofresponsiblity.prev.Processor;

public class PositiveProcessor<Integer> extends Processor<Integer> {

  public PositiveProcessor(Processor<Integer> nextProcessor) {
    super(nextProcessor);
  }

  @Override
  public void process(Integer request) {
    if ((int) request > 0) {
      System.out.println("PositiveProcessor");
    } else {
      super.process(request);
    }
  }
}
