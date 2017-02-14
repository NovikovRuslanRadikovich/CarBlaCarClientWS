package ru.kpfu.itis.spring.interfaces.impl.cpu;


import ru.kpfu.itis.spring.interfaces.CPU;

public class IntelCPU implements CPU {
	
	public void execute(){
		System.out.println("Executed by Intel!");
	}

}
