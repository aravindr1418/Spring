package com.example.Spring;

import com.example.Spring.beans.Vehicle;
import com.example.Spring.beans.VehicleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class Application {

	public static void main(String[] args) {

	//	SpringApplication.run(Application.class, args);
//		Vehicle vehicle = new Vehicle();
//		vehicle.setName("Bugati");
//		System.out.println("this is not from the SpringbootApplication "+vehicle.getName());

		var context = new AnnotationConfigApplicationContext(VehicleConfiguration.class);
        Vehicle veh = context.getBean(Vehicle.class);
//		veh.printhello();
//		veh.setName("Aravind");
		System.out.println("The name is " + veh.getName());
		context.close();

//		Vehicle veh3 = context.getBean(Vehicle.class);
//		System.out.println("I have been here because of Primary annotation "+veh3.getName());
//
//
//		Vehicle veh = context.getBean("vehicle2",Vehicle.class);
//		System.out.println("this is from the ioc container "+veh.getName());
//
//		Vehicle ad = context.getBean("Audivehicle",Vehicle.class);
//		System.out.println("here i called the object via Bean name "+ad.getName());
//
//		String hello = context.getBean(String.class);
//		System.out.println(hello);
//
//		Integer num = context.getBean(Integer.class);
//		System.out.println(num);
	}

}
