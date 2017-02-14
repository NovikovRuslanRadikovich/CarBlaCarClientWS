package ru.kpfu.itis.spring.interfaces;

public interface HardDrive {
    byte[] read(long lba, int size);
}
