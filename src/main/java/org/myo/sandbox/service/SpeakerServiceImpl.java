package org.myo.sandbox.service;

import org.myo.sandbox.model.Speaker;
import org.myo.sandbox.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    private  SpeakerRepository repository; // = new HibernateSpeakerRepositoryImpl();

    public SpeakerServiceImpl() {
        System.out.println("SpeakerImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakerImpl constructor with repository");
        this.repository = repository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("Called after the constructor");
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerImpl setter with repository");
        this.repository = repository;
    }
}
