package structural.facade.complexparts;

public class HardDrive {
  public byte[] read(long lba, int size) {
    System.out.println(lba + " ~ " + size + " -> read");
    return String.valueOf(lba + size).getBytes();
	}
}
