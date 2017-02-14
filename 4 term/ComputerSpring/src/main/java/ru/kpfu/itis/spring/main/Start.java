package ru.kpfu.itis.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kpfu.itis.spring.AppConfig;
import ru.kpfu.itis.spring.interfaces.impl.computer.LenovoYoga;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
//        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
//                AppConfig.class);
        LenovoYoga lenovoYoga = (LenovoYoga) context.getBean("lenovoYoga");
        lenovoYoga.startComputer();
    }
}
