package ru.itis.kpfu.spring.interfaces;

public interface HardDrive {
    byte[] read(long lba, int size);
}
