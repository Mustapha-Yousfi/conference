package org.myo.sandbox;

import org.myo.sandbox.repository.HibernateSpeakerRepositoryImpl;
import org.myo.sandbox.repository.SpeakerRepository;
import org.myo.sandbox.service.SpeakerService;
import org.myo.sandbox.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean("speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl(getRepository());
    }

    @Bean(name = "repository")
    public SpeakerRepository getRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
