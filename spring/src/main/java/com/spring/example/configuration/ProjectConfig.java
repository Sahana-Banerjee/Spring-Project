package com.spring.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
 * Spring @Configuration annotation is part of the spring core framework.
 * It indicates that the class has a bean definition methods , which the Spring container
 * can process and generate Beans to be used in application.
 */

import com.spring.example.beans.Vehicle;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle beanVehicle(){
        var v = new Vehicle();//var introduced in java 10 of type inference
        v.setName("Honda");
        return v;
    }

    @Bean
    Integer number() {
        return 10;
    }
}
