package org.myo.sandbox.service;

import org.myo.sandbox.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
