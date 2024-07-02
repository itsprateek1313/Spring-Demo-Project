package com.myfirstproject.demoProject;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="data.base" , havingValue = "production")
public class ProdDB implements DB {
    public String getData(){
        return "Production Data";
    }
}

