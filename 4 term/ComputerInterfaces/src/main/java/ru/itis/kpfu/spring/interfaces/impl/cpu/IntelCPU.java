package ru.itis.kpfu.spring.interfaces.impl.cpu;

import ru.itis.kpfu.spring.interfaces.CPU;

public class IntelCPU implements CPU{
	
	public void execute(){
		System.out.println("Executed by Intel!");
	}

}
