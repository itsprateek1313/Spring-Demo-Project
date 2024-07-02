package com.myfirstproject.demoProject;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="data.base" , havingValue = "development")
public class DevDB implements DB{
    public String getData(){
        return "Development Data";
    }
}
