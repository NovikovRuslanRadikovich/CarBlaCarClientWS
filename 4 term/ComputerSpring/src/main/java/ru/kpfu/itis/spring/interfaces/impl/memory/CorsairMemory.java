package ru.kpfu.itis.spring.interfaces.impl.memory;

import org.springframework.stereotype.Component;
import ru.kpfu.itis.spring.interfaces.Memory;

public class CorsairMemory implements Memory {
    public void load(long position, byte[] data) {
        System.out.println(
                "Loaded by Corsair"
        );
    }
}
