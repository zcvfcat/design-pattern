package structure.facade.complexparts;

public class CPU {
  public void freeze() {
    System.out.println("freeze");
  }

  public void jump(long position) {
    System.out.println(position + " -> jump");
  }

  public void execute() {
    System.out.println("execute");
  }
}
