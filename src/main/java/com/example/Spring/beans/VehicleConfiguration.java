package com.example.Spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.Spring.beans")
public class VehicleConfiguration {

//
//    @Bean("Audivehicle")
//    Vehicle vehicle() {
//        Vehicle veh = new Vehicle();
//        veh.setName("Audi R8");
//        return veh;
//    }
//
//    @Bean
//    Vehicle vehicle2(){
//        Vehicle veh = new Vehicle();
//        veh.setName("Bumblebee");
//        return veh;
//    }
//    @Primary
//    @Bean
//    Vehicle vehicle3(){
//        Vehicle veh = new Vehicle();
//        veh.setName("Honda");
//        return veh;
//    }
//
//    @Bean
//    String hello(){
//        return "hello";
//    }
//
//    @Bean
//    Integer number(){
//        return 4;
//    }

}
