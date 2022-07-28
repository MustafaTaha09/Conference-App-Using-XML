package com.example.conference;

import com.example.model.Speaker;
import com.example.repository.HibernateSpeakerRepositoryImpl;
import com.example.repository.SpeakerRepository;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ConferenceApplication {

    public static void main(String[] args) {

//        SpeakerRepository repo = new HibernateSpeakerRepositoryImpl();
//        SpeakerService service = new SpeakerServiceImpl(repo);
//
//        System.out.println(service.findall().get(0).getFirstName());
//
//        SpringApplication.run(ConferenceApplication.class, args);

        //note here the appContext has a different class than the old one.
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //speakerService is the name of the bean in the xml
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findall().get(0).getFirstName());
        System.out.println(service.findall().get(0).getSeedNum());


    }

}
