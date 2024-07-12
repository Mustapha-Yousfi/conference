package org.myo.sandbox.repository;

import org.myo.sandbox.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class AnotherSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {

        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Mustapha");
        speaker.setLastName("Yousfi");

        speakers.add(speaker);

        return speakers;
    }
}