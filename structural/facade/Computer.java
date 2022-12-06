package structural.facade;

import structural.facade.complexparts.CPU;
import structural.facade.complexparts.HardDrive;
import structural.facade.complexparts.Memory;

public class Computer {
  final static Long BOOT_ADDRESS = 0L;
  final static Long BOOT_SECTOR = 0L;
  final static int SECTOR_SIZE = 0;

  public void startComputer() {
    final CPU cpu = new CPU();
    final Memory memory = new Memory();
    final HardDrive hardDrive = new HardDrive();
    cpu.freeze();
    memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
    cpu.jump(BOOT_ADDRESS);
    cpu.execute();
  }
}
