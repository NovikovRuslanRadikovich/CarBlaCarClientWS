package ru.kpfu.itis.spring.interfaces.impl.computer;

import ru.kpfu.itis.spring.interfaces.CPU;
import ru.kpfu.itis.spring.interfaces.Computer;
import ru.kpfu.itis.spring.interfaces.HardDrive;
import ru.kpfu.itis.spring.interfaces.Memory;

public class LenovoYoga implements Computer{

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public static final Long BOOT_ADDRESS = 0x9d000000L;
    public static final Long BOOT_SECTOR = 123123L;
    public static final int SECTOR_SIZE = 1024;

    public LenovoYoga() {
    }

    public LenovoYoga(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void startComputer() {
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.execute();
    }

    public void freeze() {
        System.out.println("Lenovo Yoga freezes");
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }
}
