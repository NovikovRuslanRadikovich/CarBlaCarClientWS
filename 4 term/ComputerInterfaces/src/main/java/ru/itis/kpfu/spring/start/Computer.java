package ru.itis.kpfu.spring.start;

import ru.itis.kpfu.spring.interfaces.CPU;
import ru.itis.kpfu.spring.interfaces.HardDrive;
import ru.itis.kpfu.spring.interfaces.Memory;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public static final Long BOOT_ADDRESS = 0x9d000000L;
    public static final Long BOOT_SECTOR = 123123L;
    public static final int SECTOR_SIZE = 1024;

    public Computer(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void startComputer() {
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.execute();
    }
}