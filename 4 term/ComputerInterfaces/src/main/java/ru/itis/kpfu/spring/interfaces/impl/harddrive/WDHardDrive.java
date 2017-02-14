package ru.itis.kpfu.spring.interfaces.impl.harddrive;

import ru.itis.kpfu.spring.interfaces.HardDrive;

public class WDHardDrive implements HardDrive {
    public byte[] read(long lba, int size) {
        System.out.printf("Read %d of bytes from WD", size);
        System.out.println();
        return null;
    }
}
