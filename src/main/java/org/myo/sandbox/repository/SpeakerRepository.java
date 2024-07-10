package org.myo.sandbox.repository;

import org.myo.sandbox.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
