package com.spring.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.example.beans.Vehicle;
import com.spring.example.configuration.ProjectConfig;

/**
 * Main laucher class of application
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
       Vehicle veh = context.getBean(Vehicle.class);
       System.out.println(veh.getName());

       var num = context.getBean(Integer.class);
       System.out.println(num);
    }
}
