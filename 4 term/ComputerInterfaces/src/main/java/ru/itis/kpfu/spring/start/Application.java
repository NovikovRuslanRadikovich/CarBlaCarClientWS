package ru.itis.kpfu.spring.start;

import ru.itis.kpfu.spring.interfaces.CPU;
import ru.itis.kpfu.spring.interfaces.HardDrive;
import ru.itis.kpfu.spring.interfaces.Memory;
import ru.itis.kpfu.spring.interfaces.impl.cpu.IntelCPU;
import ru.itis.kpfu.spring.interfaces.impl.harddrive.WDHardDrive;
import ru.itis.kpfu.spring.interfaces.impl.memory.KingstonMemory;

public class Application {
    public static void main(String[] args) {

        CPU intelCPU = new IntelCPU();
        Memory kingstonMemory = new KingstonMemory();
        HardDrive wdHardDrive = new WDHardDrive();

        Computer computer = new Computer(intelCPU, kingstonMemory, wdHardDrive);
        computer.startComputer();
    }
}
