package ru.itis.kpfu.spring.objects;

public class WDHardDrive {
    public byte[] read(long lba, int size) {
        System.out.printf("Read %d of bytes", size);
        System.out.println();
        return null;
    }
}
