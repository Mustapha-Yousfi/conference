package org.myo.sandbox.service;

import org.myo.sandbox.model.Speaker;
import org.myo.sandbox.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private  SpeakerRepository repository; // = new HibernateSpeakerRepositoryImpl();

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
