package com.example.Spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.example.Spring.beans","com.example.Spring.implementations"
,"com.example.Spring.services"})

public class VehicleConfiguration {



//    @Bean
//    Vehicle vehicle1(){
//    Vehicle veh = new Vehicle();
//    veh.setName("Lambogini");
//    return veh;
//}
//
//@Bean
//
//    Vehicle vehicle2(){
//    Vehicle veh  = new Vehicle();
//    veh.setName("Bugati");
//    return veh;
//}
//
//@Bean
//    Vehicle vehicle3(){
//        Vehicle veh = new Vehicle();
//        veh.setName("Audi");
//    return veh;
//}
//
//


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
