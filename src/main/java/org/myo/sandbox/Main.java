package org.myo.sandbox;

import org.myo.sandbox.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = context.getBean("speakerService", SpeakerService.class);


        System.out.println(service.findAll().get(0).getFirstName() );
        System.out.println(service.findAll().get(0).getSeedNum() );

    }
}