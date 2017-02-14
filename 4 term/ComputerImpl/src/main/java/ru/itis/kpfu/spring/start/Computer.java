package ru.itis.kpfu.spring.start;

import ru.itis.kpfu.spring.objects.IntelCPU;
import ru.itis.kpfu.spring.objects.KingstonMemory;
import ru.itis.kpfu.spring.objects.WDHardDrive;

public class Computer {
    private IntelCPU cpu;
    private KingstonMemory memory;
    private WDHardDrive hardDrive;

    public static final Long BOOT_ADDRESS = 0x9d000000L;
    public static final Long BOOT_SECTOR = 123123L;
    public static final int SECTOR_SIZE = 1024;

    public Computer() {
        this.cpu = new IntelCPU();
        this.memory = new KingstonMemory();
        this.hardDrive = new WDHardDrive();
    }

    public void startComputer() {
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.execute();
    }
}