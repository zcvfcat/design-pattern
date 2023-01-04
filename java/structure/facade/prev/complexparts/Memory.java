package structure.facade.prev.complexparts;

public class Memory {
  public void load(long position, byte[] data) {
    System.out.println(position + " : " + data + " -> 메모리 로드");
  }

}
