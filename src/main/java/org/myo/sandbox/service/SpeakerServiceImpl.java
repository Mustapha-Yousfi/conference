package org.myo.sandbox.service;

import org.myo.sandbox.model.Speaker;
import org.myo.sandbox.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private  SpeakerRepository repository; // = new HibernateSpeakerRepositoryImpl();

    public SpeakerServiceImpl() {
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("In the setter");
        this.repository = repository;
    }
}
