package com.example.Spring.beans;


import com.example.Spring.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Vehicle {
    private String name ="Bugati";
    private final VehicleService vehicleService;



    @Autowired
    public Vehicle(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }
//    @PostConstruct
//    public void initialze(){
//        this.name = "Aravind";
//        printhello();
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("the bean is going to destroy  ...... DESTROYED");
//    }

    public void printhello(){
        System.out.println("Hai "+getName());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
