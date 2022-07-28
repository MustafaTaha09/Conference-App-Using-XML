package com.example.service;

import com.example.model.Speaker;
import com.example.repository.HibernateSpeakerRepositoryImpl;
import com.example.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;


public class SpeakerServiceImpl implements SpeakerService {




    private SpeakerRepository repository;

    public SpeakerServiceImpl(){

    }
    public SpeakerServiceImpl(SpeakerRepository _speakerRepository){
        repository= _speakerRepository;
    }

    @Override
    public List<Speaker> findall(){

        return repository.findall();

    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void initialize(){
        System.out.println("we are called after the constructor!");

    }
}
