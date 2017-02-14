package ru.kpfu.itis.spring.interfaces.impl.memory;


import ru.kpfu.itis.spring.interfaces.Memory;

public class KingstonMemory implements Memory {

    public void load(long position, byte[] data){
        System.out.println("Loaded in Kingston memory");
    }

}
