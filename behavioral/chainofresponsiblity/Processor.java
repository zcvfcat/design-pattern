package behavioral.chainofresponsiblity;

public abstract class Processor<T> {
  private Processor<T> nextProcessor;

  public Processor(Processor<T> nextProcessor) {
    this.nextProcessor = nextProcessor;
  };

  public void process(T request) {
    if (nextProcessor != null)
      nextProcessor.process(request);
  };
}
