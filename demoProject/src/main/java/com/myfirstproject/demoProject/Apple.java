package com.myfirstproject.demoProject;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Apple {

    void eatApple(){
        System.out.println("I am ating Apple");
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed(){
        System.out.println("Before Apple");
    }

    @PreDestroy
    void callThisAfterAppleIsDestroyed(){
        System.out.println("After Apple");
    }
}


