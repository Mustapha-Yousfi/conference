package org.myo.sandbox;

import org.myo.sandbox.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        SpeakerService service = context.getBean("speakerService", SpeakerService.class);


        System.out.println(service.findAll().get(0).getFirstName() );
    }
}