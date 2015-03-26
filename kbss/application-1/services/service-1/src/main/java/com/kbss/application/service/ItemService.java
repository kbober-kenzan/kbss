package com.kbss.application.service;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

import org.springframework.stereotype.Service;

@Singleton
@Service
public class ItemService {
    
	public static final String GREETING = "Greetings from another mother via Jersey!!!";

    @PostConstruct
    public void init() {
        System.out.println("We are post constructing...");
    }

    public String get() {
        return GREETING;
    }
}