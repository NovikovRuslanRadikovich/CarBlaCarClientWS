package ru.itis.kpfu.spring.interfaces.impl.memory;


import ru.itis.kpfu.spring.interfaces.Memory;

public class KingstonMemory implements Memory{

    public void load(long position, byte[] data){
        System.out.println("Loaded in Kingston memory");
    }

}
