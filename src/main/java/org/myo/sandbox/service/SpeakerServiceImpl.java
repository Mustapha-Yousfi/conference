package org.myo.sandbox.service;

import org.myo.sandbox.model.Speaker;
import org.myo.sandbox.repository.HibernateSpeakerRepositoryImpl;
import org.myo.sandbox.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private final SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
