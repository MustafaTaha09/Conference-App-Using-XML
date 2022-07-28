package com.example.repository;

import com.example.model.Speaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Value("#{T(java.lang.Math).random() * 100}")
    private double seedNum;

    @Override
    public List<Speaker> findall() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Mustafa");
        speaker.setLastName("Taha");
        speaker.setSeedNum(seedNum);

        speakers.add(speaker);

        return speakers;
    }

}
